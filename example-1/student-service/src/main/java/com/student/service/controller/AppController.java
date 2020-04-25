package com.student.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.service.model.Student;

@RestController
public class AppController {

	@Autowired
	private Student student;

	@GetMapping(value = "/students")
	private Student findStudent() {
		return student;
	}
}