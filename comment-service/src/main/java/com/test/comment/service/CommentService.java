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
import java.util.List;

@Service
public class CommentService {

    private final JdbcTemplate jdbcTemplate;

    private final DataSource dataSource;

    public CommentService(final JdbcTemplate jdbcTemplate, final DataSource dataSource) {
        this.jdbcTemplate = jdbcTemplate;
        this.dataSource = dataSource;
    }

    public Comment create(final Comment comment) {
        final SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("comment")
                .usingGeneratedKeyColumns("id");
        final Map<String, Object> map = new HashMap<>();
        map.put("topic", comment.getTopic());
        map.put("message", comment.getMessage());
        final Number id = simpleJdbcInsert.executeAndReturnKey(map);
        return id == null ? null : get(id.longValue());
    }

    private Comment get(final Long id) {
        final String query = "SELECT * FROM comment WHERE id = ?";
        return jdbcTemplate.queryForObject(query, new Object[] { id }, this::mapRow);
    }

    public Comment getComment(final Long id) {
        return get(id);
    }

    public int deleteComment(final Long id) {
        final String query = "Delete from comment WHERE id = ?";
        return jdbcTemplate.update(query, new Object[] { id });
    }

    public List<Comment> getTopicComments(final String topic) {
        final String query = "SELECT * FROM comment WHERE topic = ?";
        final List<Comment> comments = jdbcTemplate.query(query, new Object[] { topic }, this::mapRow);
        return comments;
    }

    public Comment mapRow(final ResultSet rs, final int rowNum) throws SQLException {
        final Comment comment = new Comment();
        comment.setId(rs.getLong("id"));
        comment.setMessage(rs.getString("message"));
        comment.setTopic(rs.getString("topic"));
        return comment;
    }

}
