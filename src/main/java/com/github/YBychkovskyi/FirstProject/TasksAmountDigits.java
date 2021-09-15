package com.github.YBychkovskyi.FirstProject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TasksAmountDigits {
  public static void main(String[] args) throws IOException {

    FileReader fr = new FileReader("input.txt");
    Scanner scanner = new Scanner(fr);

    int scrA = scanner.nextInt();

    if (scrA < 0 || scrA > 30000) {
      System.out.println("Помилка");
      throw new RuntimeException("Runtime");
    }

    final var length = String.valueOf(scrA).length();

    int m = 1;

    for (int i = 1; i < length; i++) {
      m = m * 10;
    }
    final var rozrad = m;

    int x, y = scrA;
    int r = rozrad;

    int[] mass = new int[String.valueOf(scrA).length()];

    for (int i = 0; i < String.valueOf(scrA).length(); i++) {
      x = y / r;
      y = scrA % r;
      mass[i] = x;
      r = r / 10;
    }

    int sum = 0;
    for (int i = 0; i < mass.length; i++) {
      sum += mass[i];
    }

    FileWriter fileWriter = new FileWriter("output.txt");
    fileWriter.write(sum + " ");
    fileWriter.close();
  }
}
