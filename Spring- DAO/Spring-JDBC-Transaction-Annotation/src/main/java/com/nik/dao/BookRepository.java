package com.nik.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void save() {
		final String INSERT_BOOK_QUERY = "insert into Book (bookId, bookName, price) values ('1', 'Java', 123)";
		jdbcTemplate.update(INSERT_BOOK_QUERY);
		System.out.println("Book saved successfully");
	}
}
