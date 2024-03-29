package com.github.YBychkovskyi.FirstProject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TasksPowerOfTwo {
  public static void main(String[] args) throws IOException {


    FileReader fr = new FileReader("input.txt");
    Scanner scanner = new Scanner(fr);

    int scrA = scanner.nextInt();

    if (scrA < 0 || scrA > 1024) {
      System.out.println("Помилка");
      throw new RuntimeException("Runtime");
    }

    FileWriter fileWriter = new FileWriter("output.txt");

    if ((scrA > 0) && ((scrA & (scrA - 1)) == 0)) {
      fileWriter.write("YES");
    } else fileWriter.write("NO");

    fileWriter.close();
  }
}
