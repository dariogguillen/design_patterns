package org.test.patrones.abstracfactory;

abstract public class PizzaZone {

  abstract Pizza createPizza(String type);

  public Pizza orderPizza(String type) {
    Pizza pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

}
