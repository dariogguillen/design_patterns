package org.test.patrones.abstracfactory;

public class Main {

  public static void main(String[] args) {
    PizzaZone nyZone = new PizzaNewYork();

    Pizza pizza = nyZone.orderPizza("veg");
    Pizza pizza2 = nyZone.orderPizza("pepperoni");
    Pizza pizza3 = nyZone.orderPizza("cheese");

    System.out.println(pizza);
    System.out.println(pizza2);
    System.out.println(pizza3);
  }
}
