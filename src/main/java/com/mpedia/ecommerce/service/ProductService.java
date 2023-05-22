package com.mpedia.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpedia.ecommerce.entity.Product;
import com.mpedia.ecommerce.exception.ResourceNotFoundException;
import com.mpedia.ecommerce.repository.ProductRepository;

@Service
public class ProductService {
  
  @Autowired
  private ProductRepository productRepository;

  public List<Product> findAll() {
    return productRepository.findAll();
  }

  public Product findById(String id) {
    return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not found"));
  }
}
