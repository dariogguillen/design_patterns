package org.test.files.services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileService {

  public void createFile(String name) throws IOException {
    File file = new File(name);

    FileWriter writer = new FileWriter(file, true);

    writer.append("Writing text\n")
        .append("Writing more text\n")
        .append("Writing and more text");
    writer.flush();
    writer.close();

  }

  public void createFile1(String name) throws IOException {
    File file = new File(name);

    FileWriter writer = new FileWriter(file, true);
    BufferedWriter buffer = new BufferedWriter(writer);

    buffer.append("Writing text\n")
        .append("Writing more text\n")
        .append("Writing and more text");
    buffer.flush();
    buffer.close();
  }

  public void createFile2(String name) /* throws IOException */ {
    File file = new File(name);

    try (BufferedWriter buffer = new BufferedWriter(new FileWriter(file, true))) {
      buffer.append("Writing text\n")
          .append("Writing more text\n")
          .append("Writing and more text");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String read(String name) {
    StringBuilder sb = new StringBuilder();
    File file = new File(name);
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      while (reader.readLine() != null) {
        sb.append(reader.readLine());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return sb.toString();
  }

  public String read2(String name) {
    StringBuilder sb = new StringBuilder();
    File file = new File(name);
    try (Scanner s = new Scanner(file)) {
      s.useDelimiter("\n");

      while (s.hasNext()) {
        sb.append(s.next()).append("\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return sb.toString();
  }

}
