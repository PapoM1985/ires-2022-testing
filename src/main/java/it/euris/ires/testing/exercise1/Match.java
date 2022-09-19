package it.euris.ires.testing.exercise1;

import lombok.Data;

@Data
public class Match {

  private Player player1;
  private Player player2;

  public Match(Player player1, Player player2) {
    this.player1 = player1;
    this.player2 = player2;
  }

  public Player play() {
    player1.makeMove();
    player2.makeMove();

    Player winner;

    if (player1.getMove().equals(player2.getMove())) {
      System.out.println("It's a draw!");
      return null;
    } else if ((player1.getMove().equals(Move.ROCK) && player2.getMove().equals(Move.SCISSORS))
        || (player1.getMove().equals(Move.SCISSORS) && player2.getMove().equals(Move.PAPER))
        || (player1.getMove().equals(Move.PAPER) && player2.getMove().equals(Move.ROCK))) {
      winner = player1;
    } else {
      winner = player2;
    }
    System.out.println("Player " + winner.getName() + " wins!");
    winner.setScore(winner.getScore() + 1);
    return winner;
  }
}
