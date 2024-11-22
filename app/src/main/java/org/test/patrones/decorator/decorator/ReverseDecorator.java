package org.test.patrones.decorator.decorator;

import org.test.patrones.decorator.Formatter;

public class ReverseDecorator extends TextDecorator {

  public ReverseDecorator(Formatter text) {
    super(text);
  }

  @Override
  public String format() {
    StringBuffer sb = new StringBuffer(text.format());
    return sb.reverse().toString();
  }

}
