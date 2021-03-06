package com.example.kkpolak.Jardrew.entity.bed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FRONT")
public class Front {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private int id;
  private String material;
  private int length;
  private int width;
  private int size;

}
