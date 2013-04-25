package com.trumanliu.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.trumanliu.domain.Admin;
import com.trumanliu.service.AdminService;

public class AdminAction extends ActionSupport implements ModelDriven<Admin>,
		SessionAware {
	private static final long serialVersionUID = 1L;
	private Admin admin = new Admin();
	private Map<String, Object> session;
	private AdminService adminService;
	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public Admin getModel() {
		return admin;
	}

	public String checkLogin() {
		Admin adm = adminService.getAdmin(admin);
		if(adm.getPassword()!=null&&adm.getPassword().equals(admin.getPassword())){
			session.put("admin", adm);
			return SUCCESS;
		}else{
			return ERROR;
		}
	
	}
	public String edit(){
		return "edit";
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;

	}


}
