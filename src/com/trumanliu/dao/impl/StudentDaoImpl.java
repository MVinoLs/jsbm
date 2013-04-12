package com.trumanliu.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.trumanliu.dao.StudentDao;
import com.trumanliu.domain.Student;

@Transactional
public class StudentDaoImpl implements StudentDao {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addStudent(Student stu) {
		sessionFactory.getCurrentSession().save(stu);
	}

	public void delStudent(Student stu) {
		sessionFactory.getCurrentSession().delete(stu);

	}

	public void updStudent(Student stu) {
		// TODO Auto-generated method stub

	}

	public Student getStudent(Student stu) {
		try {
			return (Student) sessionFactory.getCurrentSession().get(Class.forName("com.trumanliu.domain.Student"), stu.getStuid());
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
		return null;
	}

	public List<Student> getAllStudents() {
		String hql = "from Student";
		return sessionFactory.getCurrentSession().createQuery(hql).list();
	}

}
