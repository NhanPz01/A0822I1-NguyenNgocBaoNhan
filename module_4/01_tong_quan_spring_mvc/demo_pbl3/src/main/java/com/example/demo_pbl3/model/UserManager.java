package com.example.demo_pbl3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="user_account")
public class UserManager {
	@Id
	protected String username;
	protected String password;
	
	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}


	public boolean checkLogin(String username, String password) {
		if(this.username == username && this.password == password) return true;
		return false;
	}
}
