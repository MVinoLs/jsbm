package com.trumanliu.service.impl;

import java.util.List;

import com.trumanliu.dao.StudentDao;
import com.trumanliu.domain.Student;
import com.trumanliu.service.StudentService;

public class StudentServiceImpl implements StudentService {
	private StudentDao stuDao;

	public StudentDao getStuDao() {
		return stuDao;
	}

	public void setStuDao(StudentDao stuDao) {
		this.stuDao = stuDao;
	}

	public void addStudent(Student stu) {
		stuDao.addStudent(stu);
	}

	public void delStudent(Student stu) {
		// TODO Auto-generated method stub

	}

	public void updStudent(Student stu) {
		// TODO Auto-generated method stub

	}

	public Student getStudent(Student stu) {
		return stuDao.getStudent(stu);
	}

	public List<Student> getAllStudents() {
		return stuDao.getAllStudents();
	}

	}


