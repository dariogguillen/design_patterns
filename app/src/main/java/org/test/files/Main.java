package org.test.files;

import java.io.IOException;

import org.test.files.services.FileService;

public class Main {
  public static void main(String[] args) throws IOException {
    String fileName = "/home/dariogg/Documents/java.txt";

    FileService service = new FileService();
    service.createFile(fileName);

    String text = service.read(fileName);
    System.out.println(text);

    text = service.read2(fileName);
    System.out.println(text);
  }

}
