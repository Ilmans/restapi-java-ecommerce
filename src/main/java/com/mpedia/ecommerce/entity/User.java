package com.mpedia.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class User {
  
  @Id
  private String id;
  private String username;
  private String password;
  private String name;
  private String address;
  private String email;
  private String hp;
  private String roles;
  private Boolean isActive;
}
