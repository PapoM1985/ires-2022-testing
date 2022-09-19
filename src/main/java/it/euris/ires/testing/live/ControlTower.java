package it.euris.ires.testing.live;

public class ControlTower implements IControlTower {
  @Override
  public String sayHello(String greeting) {
    return "Hello " + greeting;
  }
}
