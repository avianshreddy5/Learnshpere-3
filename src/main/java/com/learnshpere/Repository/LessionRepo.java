package com.learnshpere.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.learnshpere.Entity.Lession;

@Repository
public interface LessionRepo extends JpaRepository<Lession, Integer> {

}
