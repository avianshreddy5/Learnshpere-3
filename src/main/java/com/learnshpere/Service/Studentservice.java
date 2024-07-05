package com.learnshpere.Service;

import java.util.List;

import com.learnshpere.Entity.Lession;

public interface Studentservice {
	Lession getlessionid(int lession_id);

	List<Lession> Lessionlist();
}
