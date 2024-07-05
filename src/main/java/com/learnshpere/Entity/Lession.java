package com.learnshpere.Entity;

import jakarta.persistence.Entity;


import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Lession {

	@Id
	int lession_id;
	String lession_name;
	String topic;
	String link;
	@ManyToOne
	Course course;
	public Lession() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lession(int lession_id, String lession_name, String topic, String link, Course course) {
		super();
		this.lession_id = lession_id;
		this.lession_name = lession_name;
		this.topic = topic;
		this.link = link;
		this.course = course;
	}
	public int getLession_id() {
		return lession_id;
	}
	public void setLession_id(int lession_id) {
		this.lession_id = lession_id;
	}
	public String getLession_name() {
		return lession_name;
	}
	public void setLession_name(String lession_name) {
		this.lession_name = lession_name;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Lession [lession_id=" + lession_id + ", lession_name=" + lession_name + ", topic=" + topic + ", link="
				+ link + ", course=" + course + "]";
	}
	
}
