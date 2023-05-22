package com.mpedia.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpedia.ecommerce.entity.Cart;

public interface CartRepository extends JpaRepository<Cart,String> {
  
}
