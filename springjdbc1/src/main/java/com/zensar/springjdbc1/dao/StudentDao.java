package com.zensar.springjdbc1.dao;

import com.zensar.springjdbc1.entity.Student;

public interface StudentDao {
public int insertStudent(Student student);
public int changeStudent(Student student);
public int deleteStudent(int studentID);

}
