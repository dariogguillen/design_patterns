package org.test.patrones.decorator.decorator;

import org.test.patrones.decorator.Formatter;

public class ReplaceSpace extends TextDecorator {

  public ReplaceSpace(Formatter text) {
    super(text);
  }

  @Override
  public String format() {
    return text.format().replace(" ", "_");
  }

}
