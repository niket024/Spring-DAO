package com.nik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nik.dao.BookRepository;

@Service
@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private StoryService storyService;

	@Autowired
	private AuthorService authorService;

	public void save() {
		bookRepository.save();
		storyService.save();
		authorService.save();
		//throw new RuntimeException("this exception in throwing intentionally");

	}

}