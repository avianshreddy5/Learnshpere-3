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
import com.learnshpere.Service.Trainerservice;

@Controller
public class TrainerController {

	@Autowired
	Trainerservice Tservice;

	@PostMapping("/addcourse")
	public String addcourse(@RequestParam("course_id") int course_id, @RequestParam("course_name") String course_name,
			@RequestParam("course_price") int course_price) {
		Course course = new Course();
		course.setCourse_id(course_id);
		course.setCourse_name(course_name);
		course.setCourse_price(course_price);
		Tservice.addcourse(course);
		return "redirect:/";
	}

	@PostMapping("/addlession")

	public String addlession(@RequestParam("course_id") int course_id, @RequestParam("lession_id") int lession_id,
			@RequestParam("lession_name") String lession_name, @RequestParam("topic") String topic,
			@RequestParam("link") String link) {
		Course c = Tservice.getcourseid(course_id);
		Lession lession = new Lession(lession_id, lession_name, topic, link, c);
		Tservice.addlession(lession);
		c.getLession().add(lession);
		return "redirect:/";

	}

	@GetMapping("/showcourses")
	public String showcourses(Model model) {
		List<Course> courselist = Tservice.courselist();

		System.out.println(courselist);

		model.addAttribute("clist", courselist);
		// System.out.println(courselist);

		return "mycourses";
	}

}
