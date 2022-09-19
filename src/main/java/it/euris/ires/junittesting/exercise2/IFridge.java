package it.euris.ires.junittesting.exercise2;

import java.time.LocalDate;

public interface IFridge {

  void setCurrentDate();

  void openFridge();

  void closeFridge();

  Product scanAddedItem(String name, LocalDate expirationDate, Status status);

  Product scanRemovedItem(String name);

  void simulateDayOver();

  void showDisplay();
}
