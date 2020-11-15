package com.nik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nik.dao.StoryRepository;

@Service
public class StoryServiceImpl implements StoryService {
	@Autowired
	private StoryRepository storyRepository;
	
	//Saving a story is in a new transaction.
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRES_NEW)
	public void save() {
		storyRepository.save();
	}

}