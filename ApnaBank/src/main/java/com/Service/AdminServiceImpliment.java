package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.AdminRepository;
import com.Model.Admin;

@Service
public class AdminServiceImpliment implements AdminService {

	@Autowired
	AdminRepository adminRepository;

	@Override
	public Admin saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}

	@Override
	public Admin getAdminByID(int id) {
		// TODO Auto-generated method stub
		return adminRepository.findById(id).orElse(null);
	}

	



	

	@Override
	public List<Admin> getAdmins() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

}
