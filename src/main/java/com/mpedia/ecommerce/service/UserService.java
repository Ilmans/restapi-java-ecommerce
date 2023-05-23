package com.mpedia.ecommerce.service;

import com.mpedia.ecommerce.entity.User;
import com.mpedia.ecommerce.exception.RequestException;
import com.mpedia.ecommerce.exception.ResourceNotFoundException;
import com.mpedia.ecommerce.repository.UserRepository;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  public User findById(String id) {
    return userRepository
      .findById(id)
      .orElseThrow(() -> new ResourceNotFoundException("User not found"));
  }

  public List<User> findAll() {
    return this.userRepository.findAll();
  }

  public User create(User user) {
    if (!StringUtils.hasText(user.getId())) {
      throw new RequestException("Id is required");
    }
    if (userRepository.existsById(user.getId())) {
      throw new RequestException("User already exists");
    }
    if (!StringUtils.hasText(user.getEmail())) {
      throw new RequestException("Email is required");
    }
    if (userRepository.existsByEmail(user.getEmail())) {
      throw new RequestException("Email already exists");
    }
    user.setIsActive(true);
    return userRepository.save(user);
  }

  public User edit(User user) {
    if(!StringUtils.hasText(user.getId())){
      throw new RequestException("username required");
    }
    if(!StringUtils.hasText(user.getEmail())){
      throw new RequestException("Email required");
    }
    user.setIsActive(true);
    return userRepository.save(user);
  }

  public void deleteById(String id) {
    userRepository.deleteById(id);
  }
}
