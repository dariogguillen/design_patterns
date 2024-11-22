package org.test.patrones.decorator.decorator;

import org.test.patrones.decorator.Formatter;

public class UnderlineDecorator extends TextDecorator {

  public UnderlineDecorator(Formatter text) {
    super(text);
  }

  @Override
  public String format() {
    String text = this.text.format();
    int longitud = text.length();
    StringBuilder sb = new StringBuilder(text);
    sb.append("\n");
    for (int i = 0; i < longitud; i++) {
      sb.append("_");
    }

    return sb.toString();
  }

}
