package com.learnshpere.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.learnshpere.Entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
	boolean existsByEmail(String email);

	Users getByEmail(String email);


}
