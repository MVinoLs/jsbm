package com.trumanliu.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.trumanliu.domain.Student;
import com.trumanliu.service.StudentService;

public class Register extends ActionSupport implements ModelDriven<Student>,SessionAware {
	private static final long serialVersionUID = 1995381113358636917L;
	private Map<String, Object> session ;
	
	private StudentService studentService;
	
	public StudentService getStudentService() {
		return studentService;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	private Student student = new Student();
	public Student getModel() {
		return student;
	}
	
	public String register() {
		studentService.addStudent(student);
		this.session.put("stu", student);
		System.out.println(session);
		return SUCCESS;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
