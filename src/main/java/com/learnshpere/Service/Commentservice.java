package com.learnshpere.Service;

import java.util.List;

import com.learnshpere.Entity.Comments;

public interface Commentservice {
	List<Comments> commentlist();
	String addcomment(Comments comment);

}
