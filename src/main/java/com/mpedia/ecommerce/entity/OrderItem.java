package com.mpedia.ecommerce.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class OrderItem {
  
  @Id
  private String id;
  @JoinColumn
  @ManyToOne
  private Order order;
  @JoinColumn
  @ManyToOne
  private Product product;
  private Double quantity;
  private BigDecimal price;
  private BigDecimal amount;

}
