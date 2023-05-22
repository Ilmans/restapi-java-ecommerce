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

import com.mpedia.ecommerce.entity.Product;
import com.mpedia.ecommerce.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
  
  @Autowired
  private ProductService productService;

  @GetMapping("/products")
  public List<Product> findAll(){
    return productService.findAll();
  }

  @GetMapping("/product/{id}")
  public Product findById(@PathVariable("id") String id) {
    return productService.findById(id);
  }

  @PostMapping("/product/create")
  public Product create(@RequestBody Product product){
    return productService.create(product);
  }

  @DeleteMapping("/product/{id}")
  public void deleteById(@PathVariable("id") String id) {
    productService.deleteById(id);
  }
}
