package com.learnshpere.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.learnshpere.Entity.Course;

@Repository
public interface TrainerRepo extends JpaRepository<Course, Integer> {

}
