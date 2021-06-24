package com.ayush.newsletter.controllers;

import com.ayush.newsletter.models.User;
import com.ayush.newsletter.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/")
  public String start() {
    return "Hello World";
  }

  @PostMapping("/adduser")
  public User addUser(@RequestBody User user) {
    return userService.saveUser(user);
  }

  @GetMapping("/users")
  public List<User> findAllUsers(User user) {
    return userService.getUsers();
  }

  @GetMapping("/user/{email}")
  public User findUserByEmail(@PathVariable String email) {
    return userService.getUser(email);
  }

  @PostMapping("/update")
  public User updateUser(@RequestBody User user) {
    return userService.updateUser(user);
  }

  @DeleteMapping("/delete/{emailId}")
  public String deleteUser(@PathVariable String emailId) {
    return userService.deleteUser(emailId);
  }
}
