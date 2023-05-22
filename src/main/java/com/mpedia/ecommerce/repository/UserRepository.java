package com.mpedia.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpedia.ecommerce.entity.User;

public interface UserRepository extends JpaRepository<User,String> {
  
}
