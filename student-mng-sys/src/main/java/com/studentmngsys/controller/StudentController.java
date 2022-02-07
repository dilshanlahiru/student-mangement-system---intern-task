package com.studentmngsys.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentmngsys.entity.Student;
import com.studentmngsys.repositary.StudentRepositary;

@CrossOrigin(origins="http://localhost:4200")


@RestController
@RequestMapping("/")
public class StudentController {
	@Autowired
	public StudentRepositary studentRepositary;
	
	//get all details
	@GetMapping("view")
	public List <Student> getAllStudentDetails() {
		return studentRepositary.findAll();
	}
	
	//new student registeration
	@PostMapping("register")
	public Student registerStudent ( @RequestBody Student student){
		return studentRepositary.save(student);
	}

}
