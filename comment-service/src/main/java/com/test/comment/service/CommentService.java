package com.test.comment.service;

import com.test.comment.model.Comment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Service
public class CommentService {

    private final JdbcTemplate jdbcTemplate;

    private final DataSource dataSource;

    public CommentService(JdbcTemplate jdbcTemplate,DataSource dataSource) {
        this.jdbcTemplate = jdbcTemplate;
        this.dataSource = dataSource;
    }

    public Comment create(Comment comment) {
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(dataSource)
                .withTableName("comment")
                .usingGeneratedKeyColumns("id");
        Map<String,Object> map = new HashMap<>();
        map.put("topic",comment.getTopic());
        map.put("message",comment.getMessage());
        Number id = simpleJdbcInsert.executeAndReturnKey(map);
        return id == null ? null : get(id.longValue());
    }

    private Comment get(Long id) {
        String query = "SELECT * FROM comment WHERE id = ?";
        return jdbcTemplate.queryForObject(query,new Object[]{id},this::mapRow);
    }

    public Comment mapRow(ResultSet rs, int rowNum) throws SQLException {
        Comment comment = new Comment();
        comment.setId(rs.getLong("id"));
        comment.setMessage(rs.getString("message"));
        comment.setTopic(rs.getString("topic"));
        return comment;
    }

}
