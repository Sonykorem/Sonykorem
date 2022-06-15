package com.zensar.springbootdemo.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.springbootdemo.entity.Student;
import com.zensar.springbootdemo.repository.StudentRepository;



@Service
public class StudentServiceImpl implements StudentService {


@Autowired
private StudentRepository studentRepository;
public StudentServiceImpl() {
}
@Override
public Student getStudent(int studentId) {
	// TODO Auto-generated method stub
	return studentRepository.findById(studentId).get();
}
@Override
public List<Student> getAllStudents() {
	// TODO Auto-generated method stub
	return studentRepository.findAll();
}
@Override
public void insertStudent(Student student) {
	// TODO Auto-generated method stub
	studentRepository.save(student);
	
}
@Override
public void updateStudent(int studentId, Student student) {
	// TODO Auto-generated method stub
	studentRepository.save(student);
}
@Override
public void deleteStudent(int studentId) {
	// TODO Auto-generated method stub
	studentRepository.deleteById(studentId);
}

}








