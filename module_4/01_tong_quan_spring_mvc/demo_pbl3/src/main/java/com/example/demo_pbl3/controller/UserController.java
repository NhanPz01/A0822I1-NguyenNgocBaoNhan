package com.example.demo_pbl3.controller;

import java.util.Optional;

import com.example.demo_pbl3.model.UserManager;
import com.example.demo_pbl3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.UserManager;
import com.example.demo.repo.UserRepo;
@Controller
public class UserController {

	@Autowired(required = true)
	private UserRepository repo;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("/signup")
	public String signup(Model model) {
		UserManager user = new UserManager();
		model.addAttribute("user", user);
		return "signupform";
	}
	@GetMapping("/registersuccess.html")
	public String registerSuccess() {
		return "register_success";
	}
	@GetMapping("/profilesetting.html")
	public String profileSetting() {
		return "profile-setting";
	}
	@GetMapping("/loginform.html")
	public String login(Model model) {
		UserManager user = new UserManager();
		model.addAttribute("user", user);
		return "loginform";
	}
	@RequestMapping("/profile.html")
	public String profile() {
		return "profile";
	}
	@PostMapping("/userLogin")
	public String loginUser(@ModelAttribute("user") UserManager user, Model model) {
		String userID=user.getusername();
		Optional<UserManager> userdata = Optional.ofNullable(repo.findByUsername(userID));
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodePassword = encoder.encode(user.getpassword());
		System.out.println(encodePassword);
		System.out.println(userdata.get().getpassword());
		
		if(user.getpassword().equals(userdata.get().getpassword())){
			model.addAttribute("name", userID);
			return "home";
		}
		else {
			return "loginerror";
		}
	}
	
	@PostMapping("/userSignup")
	public String signupUser(@ModelAttribute("user") UserManager user, Model model) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodePassword = encoder.encode(user.getpassword());
		user.setpassword(encodePassword);
		
		repo.save(user);
		
		return "register_success";
	}
}