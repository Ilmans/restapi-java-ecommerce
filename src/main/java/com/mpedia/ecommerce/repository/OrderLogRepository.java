package com.mpedia.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpedia.ecommerce.entity.OrderLog;

public interface OrderLogRepository extends JpaRepository<OrderLog ,String> {
  
}
