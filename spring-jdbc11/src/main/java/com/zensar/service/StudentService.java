package com.zensar.service;

import java.util.List;


import com.zensar.entity.Student;

public interface StudentService {
	
    Student saveStudent(Student student);
 
    List<Student> fetchStudentList();
 
    Student updateStudent(Student student,int studentId);
 
    void deleteStudentById(int studentId);

}