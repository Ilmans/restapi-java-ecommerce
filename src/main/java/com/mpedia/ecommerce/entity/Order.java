package com.mpedia.ecommerce.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.mpedia.ecommerce.model.OrderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class Order {
  @Id
  private String id;
  private String ref;
  @Temporal(TemporalType.DATE)
  private Date date;
  @JoinColumn
  @ManyToOne
  private User user;
  private String addressOrder;
  private BigDecimal quantity;
  private BigDecimal ongkir;
  private BigDecimal total;
  @Enumerated(EnumType.STRING)
  private OrderStatus status;
  @Temporal(TemporalType.DATE)
  private Date createdAt;
  
}
