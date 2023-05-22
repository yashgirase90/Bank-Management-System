package com.Service;

import java.util.List;

import com.Model.Admin;

public interface AdminService {
	
	Admin saveAdmin(Admin admin);
	
	Admin getAdminByID(int id);

	List<Admin>   getAdmins();
	
	
	
	
	
}
