package it.euris.ires.testing.live;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TesterTest {

  @Test
  public void testSameString() {
    Tester t = new Tester();
    boolean result = t.isSameString("a", "a");
    assertTrue(result);
  }
}
