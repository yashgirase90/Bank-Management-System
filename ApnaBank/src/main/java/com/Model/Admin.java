package com.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int admin_Id;
	private String admin_Name;
	private String admin_Password;
	public Admin(int admin_Id, String admin_Name, String admin_Password) {
		super();
		this.admin_Id = admin_Id;
		this.admin_Name = admin_Name;
		this.admin_Password = admin_Password;
	}
	public Admin(String admin_Name, String admin_Password) {
		super();
		this.admin_Name = admin_Name;
		this.admin_Password = admin_Password;
	}
	public int getAdmin_Id() {
		return admin_Id;
	}
	public void setAdmin_Id(int admin_Id) {
		this.admin_Id = admin_Id;
	}
	public String getAdmin_Name() {
		return admin_Name;
	}
	public void setAdmin_Name(String admin_Name) {
		this.admin_Name = admin_Name;
	}
	public String getAdmin_Password() {
		return admin_Password;
	}
	public void setAdmin_Password(String admin_Password) {
		this.admin_Password = admin_Password;
	}
	public Admin() {
		super();
	}
}

