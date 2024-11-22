package org.test.patrones.decorator;

public class Text implements Formatter {

  private String text;

  public Text(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  @Override
  public String format() {
    return getText();
  }

}
