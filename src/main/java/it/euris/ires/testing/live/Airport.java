package it.euris.ires.testing.live;

import lombok.Data;

@Data
public class Airport {

  private IControlTower tower;

  public Airport(IControlTower tower) {
    this.tower = tower;
  }

  public String getTowerGreeting(String greeting) {
    return "Tower says " + tower.sayHello(greeting);
  }
}
