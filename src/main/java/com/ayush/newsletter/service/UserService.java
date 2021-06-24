package com.ayush.newsletter.service;

import com.ayush.newsletter.models.User;
import com.ayush.newsletter.repo.UserRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepo userRepo;

  // POST method
  public User saveUser(User user) {
    return userRepo.save(user);
  }

  //GET method
  public User getUser(String emailId) {
    return userRepo.findById(emailId).orElse(null);
  }

  public List<User> getUsers() {
    return userRepo.findAll();
  }

  public String deleteUser(String emailId) {
    userRepo.deleteById(emailId);
    return "Product Removed!!";
  }

  public User updateUser(User user) {
    User existingUser = getUser(user.getEmailId());
    existingUser.setName(user.getName());
    existingUser.setPhoneNo(user.getPhoneNo());
    return userRepo.save(existingUser);
  }
}
