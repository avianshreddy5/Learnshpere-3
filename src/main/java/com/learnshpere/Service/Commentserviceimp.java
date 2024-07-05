package com.learnshpere.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnshpere.Entity.Comments;
import com.learnshpere.Repository.CommentRepo;

@Service
class Commentserviceimp implements Commentservice {
	@Autowired
	CommentRepo Crepo;

	@Override
	public List<Comments> commentlist() {

		return Crepo.findAll();
	}

	@Override
	public String addcomment(Comments comment) {
		Crepo.save(comment);
		return "comments added successfully";
	}

}
