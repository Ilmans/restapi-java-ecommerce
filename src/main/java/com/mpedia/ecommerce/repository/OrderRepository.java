package com.mpedia.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpedia.ecommerce.entity.Order;

public interface OrderRepository extends JpaRepository<Order ,String> {
  
}
