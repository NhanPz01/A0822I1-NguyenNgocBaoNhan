package com.example.demo_pbl3.model;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String rawPassword = "haha";
		String encodedPassword = encoder.encode(rawPassword);
		System.out.print(encodedPassword);
	}

}
