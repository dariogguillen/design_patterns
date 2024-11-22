package org.test.patrones.decorator.decorator;

import org.test.patrones.decorator.Formatter;

public class MayusDecorator extends TextDecorator {

  public MayusDecorator(Formatter text) {
    super(text);
  }

  @Override
  public String format() {
    return text.format().toUpperCase();
  }

}
