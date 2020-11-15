package com.nik.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StoryRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void save() {
		final String INSERT_STORY_QUERY = "insert into Story (storyId, storyName) values (1, 'Java')";
		jdbcTemplate.update(INSERT_STORY_QUERY);
		System.out.println("Story saved successfully");
	}
}
