package it.euris.ires.testing.exercise2;

import java.util.regex.Pattern;

public class StringChecker implements IStringChecker {
  private final Pattern letter = Pattern.compile("[a-zA-z]");
  private final Pattern digit = Pattern.compile("[0-9]");
  private final Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");

  public StringChecker() {}

  @Override
  public boolean hasLetter(String text) {
    return letter.matcher(text).find();
  }

  @Override
  public boolean hasDigit(String text) {
    return digit.matcher(text).find();
  }

  @Override
  public boolean hasSpecial(String text) {
    return special.matcher(text).find();
  }
}
