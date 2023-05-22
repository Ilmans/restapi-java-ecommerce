package com.mpedia.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpedia.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product,String> {
  
}
