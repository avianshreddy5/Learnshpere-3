package com.learnshpere.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnshpere.Entity.Course;
import com.learnshpere.Entity.Lession;
import com.learnshpere.Service.Studentservice;
import com.learnshpere.Service.Trainerservice;

@Controller
public class StudentController {
	@Autowired
	Studentservice Sservice;

	@Autowired
	Trainerservice Tservice;

	@PostMapping("/gotolession")
	public String gotolession(@RequestParam("lession_id") int lession_id, Model model) {
		Lession lession = Sservice.getlessionid(lession_id);
		System.out.println(lession.getLession_id());
		model.addAttribute("lession", lession);
		return "mylessions";
	}

	@GetMapping("/showlessions")
	public String showlessions(Model model) {
		List<Lession> lessionlist = Sservice.Lessionlist();
		model.addAttribute("lessionlist", lessionlist);
		return "mylessions";
	}

	@GetMapping("/buy")
	public String buy(Model model) {
		List<Course> clist = Tservice.courselist();
		model.addAttribute("clist", clist);
		return "purchase";
	}

}
