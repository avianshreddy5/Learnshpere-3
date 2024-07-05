package com.learnshpere.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationBar {

	@GetMapping("/")
	public String indexpage() {
		return "index";
	}

	@GetMapping("/register")
	public String registerpage() {
		return "register";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/addlession")
	public String addlession() {
		return "addlession";
	}

	@GetMapping("/createcourse")
	public String createcourse() {
		return "createcourse";
	}

	@GetMapping("/trainerHome")
	public String trainerHome() {
		return "trainerHome";
	}

	@GetMapping("/studentHome")
	public String studentHome() {
		return "studentHome";
	}

	@GetMapping("/mycourses")
	public String mycourses() {
		return "mycourses";
	}

	@GetMapping("/courses")
	public String courses() {
		return "courses";
	}

	@GetMapping("/purchase")
	public String purchase() {
		return "purchase";
	}

	@GetMapping("/demolession")
	public String demolession() {
		return "demolession";
	}

	@GetMapping("/lessions")
	public String lessions() {
		return "lessions";
	}

	@GetMapping("/mylessions")
	public String mylessions() {
		return "mylessions";
	}

}
