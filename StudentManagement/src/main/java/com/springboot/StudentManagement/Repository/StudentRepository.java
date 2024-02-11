package com.springboot.StudentManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.StudentManagement.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	
	}
