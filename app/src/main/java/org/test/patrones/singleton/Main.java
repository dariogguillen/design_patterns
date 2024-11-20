package org.test.patrones.singleton;

public class Main {
  public static void main(String[] args) {
    DBConnection connection = DBConnection.getInstance();
    DBConnection connection2 = DBConnection.getInstance();

    System.out.println(connection == connection2);// should be true
  }
}
