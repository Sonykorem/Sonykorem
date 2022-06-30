package com.zensar.springjdbc1.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.zensar.springjdbc1.entity.Student;

public class StudentDaoImpl implements StudentDao{
private JdbcTemplate jdbcTemplate;
	
	public int insertStudent(Student student) {
		// TODO Auto-generated method stub
		String query="insert into student(id,name,age) values(?,?,?)";
		int r = this.jdbcTemplate.update(query,student.getStudentId(),student.getStudentName(),student.getStudentAge());
		return r;
	}
	public int changeStudent(Student student) {
		// TODO Auto-generated method stub
		String query="update student set name=? , age=? , where id=?";
		int r = this.jdbcTemplate.update(query,student.getStudentName(),student.getStudentAge(),student.getStudentId());
		return r;
	}
	public int deleteStudent(int studentID) {
		// TODO Auto-generated method stub
		String query="delete from student where id=?";
		int r = this.jdbcTemplate.update(query,studentID);
		return r;
	
	}
	
	}
	
	

	
	




