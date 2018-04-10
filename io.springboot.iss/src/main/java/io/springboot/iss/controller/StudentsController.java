package io.springboot.iss.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.springboot.iss.Students;
import io.springboot.iss.dataaccess.StudentDataAccess;

@RestController
public class StudentsController {
	@Autowired
private StudentDataAccess studentDataAccess;
	
	@PostMapping("/students")
	public Students createStudents(@Valid @RequestBody Students s) {
		System.out.println("Hello");
		return studentDataAccess.createNewStudents(s);
	}
	
}
