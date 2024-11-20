package org.test.patrones.singleton;

public class DBConnection {
  private static DBConnection instance;

  private DBConnection() {
    System.out.println("Conectando a la base de datos");
  }

  public static DBConnection getInstance() {
    if (instance == null) {
      instance = new DBConnection();
    } else {
      System.out.println("Conexión ya existente");
    }
    return instance;
  }
}
