package com.nik.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void save() {
		final String INSERT_AUTHOR_QUERY = "insert into Author (authorId, authorName) values ('1', 'Niket')";
		jdbcTemplate.update(INSERT_AUTHOR_QUERY);
		System.out.println("Author saved successfully");
	}
}
