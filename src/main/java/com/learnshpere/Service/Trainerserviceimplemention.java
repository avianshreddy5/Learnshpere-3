package com.learnshpere.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnshpere.Entity.Course;
import com.learnshpere.Entity.Lession;
import com.learnshpere.Repository.LessionRepo;
import com.learnshpere.Repository.TrainerRepo;

@Service
public class Trainerserviceimplemention implements Trainerservice {
	@Autowired
	TrainerRepo Trepo;
	@Autowired
	LessionRepo lrepo;

	@Override
	public String addcourse(Course course) {
		Trepo.save(course);
		return "course added successfully";
	}

	@Override
	public String addlession(Lession lession) {
		lrepo.save(lession);
		return "lession added succesffully";
	}

	@Override
	public Course getcourseid(int course_id) {
		return Trepo.findById(course_id).get();
	}

	@Override
	public List<Course> courselist() {

		return Trepo.findAll();
	}

	@Override
	public Lession getlessionid(int lession_id) {
		return lrepo.findById(lession_id).get();
	}

}
