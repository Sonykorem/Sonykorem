package com.zensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	

}
