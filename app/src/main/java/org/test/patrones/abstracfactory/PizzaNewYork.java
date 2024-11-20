package org.test.patrones.abstracfactory;

import org.test.patrones.abstracfactory.product.PizzaNYVegetarian;
import org.test.patrones.abstracfactory.product.PizzaNYCheese;
import org.test.patrones.abstracfactory.product.PizzaNYPepperoni;

public class PizzaNewYork extends PizzaZone {

  @Override
  public Pizza createPizza(String type) {
    return switch (type) {
      case "cheese" -> new PizzaNYCheese();
      case "veg" -> new PizzaNYVegetarian();
      case "pepperoni" -> new PizzaNYPepperoni();
      default -> null;
    };
  }

}
