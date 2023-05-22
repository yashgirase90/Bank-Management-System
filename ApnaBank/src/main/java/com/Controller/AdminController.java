package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Admin;
import com.Service.AdminServiceImpliment;

@RestController
public class AdminController {
	@Autowired
	AdminServiceImpliment adminServiceImpliment;

	@GetMapping(value = "/{id}")
	public Admin getAdminById(@PathVariable int id, Model model) {

		return adminServiceImpliment.getAdminByID(id);

	}

	@PostMapping(value = "/a")
	public Admin saveAdmin(@RequestBody Admin admin) {

		return adminServiceImpliment.saveAdmin(admin);
	}

	@GetMapping(value = "/list")
	public List<Admin> getListAdmin() {
		return adminServiceImpliment.getAdmins();
	}

}
