package com.ds.project.clickit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ds.project.clickit.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
}
