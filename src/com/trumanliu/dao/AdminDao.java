package com.trumanliu.dao;

import java.util.List;

import com.trumanliu.domain.Admin;



public interface AdminDao {
	void addAdmin(Admin admin);
	void delAdmin(Admin admin);
	void updAdmin(Admin admin);
	Admin getAdmin(Admin admin);
	List<Admin> getAllAdmins();

}
