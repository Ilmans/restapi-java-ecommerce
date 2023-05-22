package com.mpedia.ecommerce.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "users")
@Entity
@Data
public class User implements Serializable {
  
  @Id
  private String id;
  private String password;
  private String name;
  private String address;
  private String email;
  private String hp;
  private String roles;
  private Boolean isActive;
}
