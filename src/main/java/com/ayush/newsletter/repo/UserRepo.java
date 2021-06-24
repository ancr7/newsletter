package com.ayush.newsletter.repo;

import com.ayush.newsletter.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {

}
