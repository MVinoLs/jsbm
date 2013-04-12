package com.trumanliu.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.trumanliu.domain.Student;
import com.trumanliu.service.StudentService;

public class StudentAction extends ActionSupport implements
		ModelDriven<Student>, RequestAware {
	private static final long serialVersionUID = -1006959357244162589L;
	private StudentService studentService;
	private Map<String, Object> request;

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	// ModelDriven
	private Student student = new Student();

	public Student getModel() {
		// TODO Auto-generated method stub
		return student;
	}

	public String addStudent() throws Exception {
		studentService.addStudent(student);
		return SUCCESS;
	}

	public String showStudent() {
		List<Student> students = studentService.getAllStudents();
		System.out.println(students);
		request.put("students", students);
		return SUCCESS;
	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

}
