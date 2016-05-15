package com.apub.dorm.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apub.dorm.domain.Feedback;
import com.apub.dorm.service.FeedbackService;

@Controller
public class RESTFeedbackController {
	
	@Autowired
	private FeedbackService feedbackService;	
	
	@RequestMapping(value="/api/feedback/getAllFeedback", method=RequestMethod.GET)
	public @ResponseBody
	List<Feedback> getAllFeedbacks(){
			return feedbackService.findAll();
	}

}
