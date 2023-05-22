package com.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String AdharNo;
	private String Fname;
	private String Lname;
	private String email;
	private String Mobile;
	public User(int id, String adharNo, String fname, String lname, String email, String mobile) {
		super();
		this.id = id;
		AdharNo = adharNo;
		Fname = fname;
		Lname = lname;
		this.email = email;
		Mobile = mobile;
	}
	public User(String adharNo, String fname, String lname, String email, String mobile) {
		super();
		AdharNo = adharNo;
		Fname = fname;
		Lname = lname;
		this.email = email;
		Mobile = mobile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdharNo() {
		return AdharNo;
	}
	public void setAdharNo(String adharNo) {
		AdharNo = adharNo;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public User() {
		super();
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	
	
	
	
}
