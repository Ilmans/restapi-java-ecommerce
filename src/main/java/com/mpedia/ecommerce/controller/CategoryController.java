package com.mpedia.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mpedia.ecommerce.entity.Category;
import com.mpedia.ecommerce.service.CategoryService;

@RestController
@RequestMapping("/api")
public class CategoryController {
  
  @Autowired
  private CategoryService categoryService;

  @GetMapping("/categories")
  public List<Category> findAll(){
    return categoryService.findAll();
  }

  @GetMapping("/category/{id}")
  public Category findById(@PathVariable("id") String id) {
    return categoryService.findById(id);
  }

  @PostMapping("/category/create")
  public Category create(@RequestBody Category category){
    return categoryService.create(category);
  }

  @DeleteMapping("/category/{id}")
  public void deleteById(@PathVariable("id") String id) {
    categoryService.deleteById(id);
  }
}
