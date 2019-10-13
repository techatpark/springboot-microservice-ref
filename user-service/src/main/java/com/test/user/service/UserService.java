package com.test.user.service;

import com.test.user.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class UserService {

    private final JdbcTemplate jdbcTemplate;

    private final DataSource dataSource;

    public UserService(JdbcTemplate jdbcTemplate, DataSource dataSource) {
        this.jdbcTemplate = jdbcTemplate;
        this.dataSource = dataSource;
    }

    public User create(User comment) {
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(dataSource)
                .withTableName("comment")
                .usingGeneratedKeyColumns("id");

        return null;
    }

    private User get(Long id) {
        String query = "SELECT * FROM comment WHERE id = ?";
        return jdbcTemplate.queryForObject(query,new Object[]{id},this::mapRow);
    }

    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User comment = new User();

        return comment;
    }

}
