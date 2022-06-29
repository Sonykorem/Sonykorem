package com.zensar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entity.Student;
import com.zensar.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PostMapping("/students")
	public Student saveStudent(@Validated @RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	
	@GetMapping("/students")
	public List<Student> fetchStudentList() {
		return studentService.fetchStudentList();
	}

	
	@PutMapping("/students/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable("id") int studentId) {
		return studentService.updateStudent(student, studentId);
	}

	
	@DeleteMapping("/students/{id}")
	public String deleteStudentById(@PathVariable("id") int studentId) {
		studentService.deleteStudentById(studentId);
		return "Deleted Successfully";
	}

}