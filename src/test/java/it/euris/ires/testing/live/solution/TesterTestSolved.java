package it.euris.ires.testing.live.solution;

import it.euris.ires.testing.live.Tester;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TesterTestSolved {

  @ParameterizedTest(name = "{0} equals {1}: should be {2}")
  @CsvSource({
    "a,a,true",
    "A,a,true",
    "B,a,false",
    ",a,false",
    "a,,false",
    "'','',true",
    "'',b,false",
    "a,'',false"
  })
  public void test_string_checker(String first, String second, boolean outcome) {
    Tester tester = new Tester();
    assertEquals(outcome, tester.isSameString(first, second));
  }
}
