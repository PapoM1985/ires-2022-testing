package it.euris.ires.junittesting.exercise2;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Product {

  private String name;
  private LocalDateTime expirationDate;
  private LocalDateTime insertionDate;
  private Status status;
}
