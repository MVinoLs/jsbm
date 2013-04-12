package com.trumanliu.dao;

import java.util.List;

import com.trumanliu.domain.Student;

public interface StudentDao {
	void addStudent(Student stu);
	void delStudent(Student stu);
	void updStudent(Student stu);
	Student getStudent(Student stu);
	List<Student> getAllStudents();
}
