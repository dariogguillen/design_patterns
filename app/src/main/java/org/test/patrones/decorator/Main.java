package org.test.patrones.decorator;

import org.test.patrones.decorator.decorator.MayusDecorator;
import org.test.patrones.decorator.decorator.ReplaceSpace;
import org.test.patrones.decorator.decorator.ReverseDecorator;

public class Main {
  public static void main(String[] args) {

    Formatter text = new Text("hola que tal");
    System.out.println(text.format());
    text = new ReverseDecorator(text);
    System.out.println(text.format());
    text = new MayusDecorator(text);
    System.out.println(text.format());
    text = new ReplaceSpace(text);
    System.out.println(text.format());
  }
}
