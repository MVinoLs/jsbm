package com.trumanliu.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.trumanliu.domain.Student;
import com.trumanliu.service.StudentService;

public class Main extends ActionSupport implements ModelDriven<Student>,SessionAware {
	private static final long serialVersionUID = -1881595708877090922L;
	private Map<String, Object> session;
	private Student student = new Student();
	private StudentService stus;
	
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public StudentService getStus() {
		return stus;
	}
	public void setStus(StudentService stus) {
		this.stus = stus;
	}
	public Student getModel() {	
		return student;
	}
	public String checkLogin(){
		Student stu = stus.getStudent(student);
		System.out.println(stu.getPassword());
		System.out.println(stu.getPassword());
		System.out.println(stu.getRealname());
		System.out.println(stu.getEmail());
		if(stu!=null && (stu.getPassword().equals(student.getPassword()))){
			modifySession(stu);
			return SUCCESS;
		}else {
			return INPUT;
		}
	}
	
	
	public String register() {
		return "register";
	}
	
	public String myhome(){
		return "home";
	}
	public String logout(){
		return "logout";
	}
	
	public void modifySession(Student stu){
		System.out.println("modify");
		this.session.put("stu", stu);
	}


}
