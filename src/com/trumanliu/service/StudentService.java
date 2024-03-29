package com.trumanliu.service;

import java.util.List;

import com.trumanliu.domain.Student;

public interface StudentService {
	void addStudent(Student stu);
	void delStudent(Student stu);
	void updStudent(Student stu);
	//void export() throws Exception;
	Student getStudent(Student stu);
	List<Student> getAllStudents();
}
