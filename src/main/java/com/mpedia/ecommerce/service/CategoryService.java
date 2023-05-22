package com.mpedia.ecommerce.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpedia.ecommerce.entity.Category;
import com.mpedia.ecommerce.exception.ResourceNotFoundException;
import com.mpedia.ecommerce.repository.CategoryRepository;

@Service
public class CategoryService {
  
  @Autowired
  private CategoryRepository categoryRepository;

  public Category findById(String id) {
    return categoryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category not found"));
  }

 public List<Category> findAll() {
  return this.categoryRepository.findAll();
 }

 public Category create(Category category) {
  return categoryRepository.save(category);
 }

 public Category edit(Category category) {
  return categoryRepository.save(category);
 }

 public void deleteById(String id) {
   categoryRepository.deleteById(id);
 }
}
