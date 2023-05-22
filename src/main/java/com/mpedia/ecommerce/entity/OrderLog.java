package com.mpedia.ecommerce.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
public class OrderLog {
  @Id
  private String id;
  @JoinColumn
  @ManyToOne
  private Order order;
  @JoinColumn
  @ManyToOne
  private User user;
  private Integer logType;
  private String logMessage;
  @Temporal(TemporalType.DATE)
  private Date date;
}
