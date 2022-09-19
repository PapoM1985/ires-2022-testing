package it.euris.ires.testing.live;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AirportTest {

  @Mock private ControlTower mockTower;

  @Test
  void check_airport_message() {
    Airport a = new Airport(mockTower);
    when(mockTower.sayHello("abc")).thenReturn("Hi user");

    String s = a.getTowerGreeting("abc");
    a.getTowerGreeting("abc");
    a.getTowerGreeting("abc");
    String s2 = a.getTowerGreeting("adc");

    System.out.println(s);
    System.out.println(s2);

    verify(mockTower, times(2)).sayHello("abc");
    verify(mockTower).sayHello("adc");

    assertEquals("Tower says Hi user", s);
  }
}
