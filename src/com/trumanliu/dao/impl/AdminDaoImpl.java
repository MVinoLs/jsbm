package com.trumanliu.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.trumanliu.dao.AdminDao;
import com.trumanliu.domain.Admin;
@Transactional
public class AdminDaoImpl implements AdminDao {
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub

	}

	public void delAdmin(Admin admin) {
		// TODO Auto-generated method stub

	}

	public void updAdmin(Admin admin) {
		// TODO Auto-generated method stub

	}

	public Admin getAdmin(Admin admin) {
		try {
			//return (Admin) sessionFactory.getCurrentSession().get(Class.forName("com.trumanliu.domain.Admin"), admin.getStuid());
			return (Admin) sessionFactory.getCurrentSession().createQuery("from Admin where stuid ="+"'" +admin.getStuid()+"'").list().get(0);
		} catch (HibernateException e) {
			e.printStackTrace();
		}// catch (ClassNotFoundException e) {
			//e.printStackTrace();
		//}	
		return null;
		
	}

	public List<Admin> getAllAdmins() {
		return null;
	}

}
