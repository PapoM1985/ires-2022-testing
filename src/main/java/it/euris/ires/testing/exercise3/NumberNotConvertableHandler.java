package it.euris.ires.testing.exercise3;

public class NumberNotConvertableHandler {

  /*
  Fornisce la stringa da stampare a console se il convertitore riceve un numero non convertibile
   */
  public static String respondWhenNumberNotConvertable(int number) {
    String response = "";
    String zeroResponse = "nulla";
    String numberNegativeResponse = "No representation of negative roman numbers exist";
    String numberBiggerThan3999Response =
        "No representation of roman numbers bigger than 3999 exists";
    if (number == 0) {
      response = zeroResponse;
    } else if (number < 0) {
      response = numberNegativeResponse;
    } else if (number > 3999) {
      response = numberBiggerThan3999Response;
    }
    return response;
  }
}
