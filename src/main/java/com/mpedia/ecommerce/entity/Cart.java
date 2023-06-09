package com.mpedia.ecommerce.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class Cart implements Serializable {
  @Id
  private String id;
  @JoinColumn
  @ManyToOne
  private Product product;
  @ManyToOne
  private User user;
  private Double quantity;
  private BigDecimal price;
  private BigDecimal amount;
   @Temporal(TemporalType.DATE)
  private Date createdAt;
  
}
