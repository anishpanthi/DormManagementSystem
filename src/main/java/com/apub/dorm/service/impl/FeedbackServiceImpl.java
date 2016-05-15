package com.apub.dorm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.apub.dorm.domain.Feedback;
import com.apub.dorm.repository.FeedbackRepository;
import com.apub.dorm.service.FeedbackService;

@Component
@Transactional
public class FeedbackServiceImpl implements FeedbackService{
	
	@Autowired
	private FeedbackRepository feedbackRepository;

	@Override
	public void create(Feedback feedback) {
		feedbackRepository.save(feedback);
	}

	@Override
	public List<Feedback> findAll() {
		return feedbackRepository.findAll();
	}
}
