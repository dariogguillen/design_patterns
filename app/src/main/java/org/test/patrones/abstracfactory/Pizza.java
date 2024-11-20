package org.test.patrones.abstracfactory;

import java.util.ArrayList;
import java.util.List;

abstract public class Pizza {

  protected String name;
  protected String dough;
  protected String sauce;
  protected List<String> toppings = new ArrayList<String>();

  public void prepare() {
    System.out.println("Prepare " + this.name);
    System.out.println("Tossing dough... " + this.dough);
    System.out.println("Adding sauce... " + this.sauce);
    System.out.println("Adding toppings: ");
    this.toppings.forEach(System.out::println);
  }

  public abstract void bake();

  public abstract void cut();

  public void box() {
    System.out.println("Boxing the pizza");
  }

  @Override
  public String toString() {
    return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", toppings=" + toppings + "]";
  }

}
