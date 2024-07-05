package com.learnshpere.Entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String name;
	String number;
	String Gender;
	String role;
	String email;
	String password;

	public Users() {
		super();
	}

	public Users(long id, String name, String number, String gender, String role, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.Gender = gender;
		this.role = role;
		this.email = email;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", number=" + number + ", Gender=" + Gender + ", role=" + role
				+ ", email=" + email + ", password=" + password + "]";
	}

}