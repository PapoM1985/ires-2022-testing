package it.euris.ires.junittesting.exercise2;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Product {

  private String name;
  private LocalDate expirationDate;
  private LocalDate insertionDate;
  private Status status;
}
