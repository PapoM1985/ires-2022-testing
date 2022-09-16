package it.euris.ires.testing.live;

import java.util.Objects;

public class Tester {

  public boolean isSameString(String a, String b) {
    if (Objects.isNull(a) || Objects.isNull(b)) {
      return false;
    } else {
      return a.toUpperCase().equals(b.toUpperCase());
    }
  }
}
