package com.mpedia.ecommerce.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import lombok.Data;
@Entity
@Data
public class Category implements Serializable {
  
   @Id
   private String id;
   private String name;
   


}
