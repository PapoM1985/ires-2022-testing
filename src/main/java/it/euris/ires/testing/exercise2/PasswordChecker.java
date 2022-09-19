package it.euris.ires.testing.exercise2;

public class PasswordChecker {

  public StringChecker stringChecker;

  public PasswordChecker(StringChecker stringChecker) {
    this.stringChecker = stringChecker;
  }

  public boolean checkPassword(Password password) {

    if (!password.isAdmin()) {
      if (password.getText().length() >= 7) {
        return stringChecker.hasLetter(password.getText()) && stringChecker.hasDigit(password.getText());
      } else return false;
    } else if (password.getText().length() >= 10) {
      return stringChecker.hasLetter(password.getText())
          && stringChecker.hasDigit(password.getText())
          && stringChecker.hasSpecial(password.getText());
    } else return false;
  }

  public StringChecker getStringChecker() {
    return stringChecker;
  }

  public void setStringChecker(StringChecker stringChecker) {
    this.stringChecker = stringChecker;
  }
}
