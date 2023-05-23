package com.mpedia.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mpedia.ecommerce.entity.User;
import com.mpedia.ecommerce.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
  
  @Autowired
  private UserService userService;

  @GetMapping("/users")
  public List<User> findAll(){
    return userService.findAll();
  }

  @GetMapping("/user/{id}")
  public User findById(@PathVariable("id") String id) {
    return userService.findById(id);
  }

  
  @PostMapping("/user/create")
  public User create(@RequestBody User user){
    return userService.create(user);
  }
  
  @PutMapping("/user")
  public User edit(@RequestBody User user) {
    return userService.edit(user);
  }

  @DeleteMapping("/user/{id}")
  public void deleteById(@PathVariable("id") String id) {
    userService.deleteById(id);
  }
}
