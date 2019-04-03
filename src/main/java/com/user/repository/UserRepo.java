package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	User findByName(String name);

}
