package com.learnshpere.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnshpere.Entity.Comments;

@Repository
public interface CommentRepo extends JpaRepository<Comments, Integer> {

}
