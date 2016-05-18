package com.apub.dorm.rest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apub.dorm.domain.Student;
import com.apub.dorm.service.StudentService;

@Controller
@RequestMapping("auth/admin/api/student")
public class RESTStudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public @ResponseBody Student studentById(@RequestParam(value = "studentId", required = true) String studentId) {
		System.out.println(studentId);
		return studentService.findStudentByStudentId(studentId);
	}
	@RequestMapping(value = "/studentList", method = RequestMethod.GET)
	public @ResponseBody List<Student> studentList() {
		return studentService.findListOfStudent();
	}
	
}
