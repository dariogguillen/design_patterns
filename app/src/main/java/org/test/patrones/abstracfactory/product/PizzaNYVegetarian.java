package org.test.patrones.abstracfactory.product;

import org.test.patrones.abstracfactory.Pizza;

public class PizzaNYVegetarian extends Pizza {

  public PizzaNYVegetarian() {
    super();
    name = "NY Veggie Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";
    toppings.add("Grated Reggiano Cheese");
    toppings.add("Garlic");
    toppings.add("Onion");
    toppings.add("Mushrooms");
    toppings.add("Red Pepper");
  }

  @Override
  public void bake() {
    System.out.println("Baking " + this.name + " for 25 minutes");
    System.out.println("Adding toppings: ");
    this.toppings.forEach(System.out::println);
  }

  @Override
  public void cut() {
    System.out.println("Cutting " + this.name + " into square slices");
  }
}
