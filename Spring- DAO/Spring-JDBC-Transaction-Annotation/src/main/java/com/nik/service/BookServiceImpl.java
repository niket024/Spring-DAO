package com.nik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nik.dao.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private StoryService storyService;

	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public void save() {
		bookRepository.save();
		storyService.save();
		throw new RuntimeException("this exception in throwing intentionally");

	}
}