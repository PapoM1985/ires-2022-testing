package it.euris.ires.testing.exercise1;

import lombok.Data;

import java.util.Random;

@Data
public class Player {

  private String name;
  private Move move;
  private int score;

  public void makeMove() {
    move = Move.values()[new Random().nextInt(Move.values().length)];
  }
}
