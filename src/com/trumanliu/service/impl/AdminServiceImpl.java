package com.trumanliu.service.impl;

import java.util.List;

import com.trumanliu.dao.AdminDao;
import com.trumanliu.domain.Admin;
import com.trumanliu.service.AdminService;

public class AdminServiceImpl implements AdminService {
	private AdminDao adminDao;

	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
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
		// TODO Auto-generated method stub
		return adminDao.getAdmin(admin);
	}

	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

}
