package com.learnshpere.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.learnshpere.Entity.Lession;
import com.learnshpere.Repository.LessionRepo;

@Service
public class Studentserviceimplemention implements Studentservice {
	@Autowired
	LessionRepo Lrepo;

	@Override
	public Lession getlessionid(int lession_id) {
		return Lrepo.findById(lession_id).get();
	}

	@Override
	public List<Lession> Lessionlist() {

		return Lrepo.findAll();
	}

}
