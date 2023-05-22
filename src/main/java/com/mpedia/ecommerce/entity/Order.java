package com.mpedia.ecommerce.entity;

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
public class Order {
  @Id
  private String id;
  private String ref;
  @Temporal(TemporalType.DATE)
  private Date date;
  @JoinColumn
  @ManyToOne
  private String user;
  private String addressOrder;
  private BigDecimal quantity;
  private BigDecimal ongkir;
  private BigDecimal total;
  private String status;
  
}
