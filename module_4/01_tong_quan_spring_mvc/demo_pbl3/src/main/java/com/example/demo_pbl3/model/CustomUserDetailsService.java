package com.example.demo_pbl3.model;

import java.util.Optional;

import com.example.demo_pbl3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repo;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserManager userdata = repo.findByUsername(username);
		if(userdata == null) {
			throw new UsernameNotFoundException("User not found");
		}
		
		return new CustomUserDetails(userdata);
	}

}
