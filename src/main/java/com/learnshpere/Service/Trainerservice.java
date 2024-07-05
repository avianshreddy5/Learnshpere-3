package com.learnshpere.Service;

import java.util.List;


import com.learnshpere.Entity.Course;

import com.learnshpere.Entity.Lession;

public interface Trainerservice {
	// add course
	String addcourse(Course course);

	// add lession
	String addlession(Lession lession);

	// getting courseid
	Course getcourseid(int course_id);

	// list of courses
	List<Course> courselist();

	Lession getlessionid(int lession_id);
}
