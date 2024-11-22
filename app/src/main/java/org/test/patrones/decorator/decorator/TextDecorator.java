
package org.test.patrones.decorator.decorator;

import org.test.patrones.decorator.Formatter;

abstract public class TextDecorator implements Formatter {

  protected Formatter text;

  public TextDecorator(Formatter text) {
    this.text = text;
  }

}
