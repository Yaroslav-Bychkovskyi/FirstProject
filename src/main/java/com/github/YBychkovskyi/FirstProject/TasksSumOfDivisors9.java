package com.github.YBychkovskyi.FirstProject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TasksSumOfDivisors9 {
  public static void main(String[] args) throws IOException {
    FileWriter fileWriter = new FileWriter("input.txt");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введеть число a - ");

    int scrA = scanner.nextInt();
    fileWriter.write(scrA + "\n");
    fileWriter.close();

    if (scrA < 0 || scrA > 5000) {
      System.out.println("Помилка");
      throw new RuntimeException("Runtime");
    }

    int numeric = getNumeric(scrA);

    FileWriter fileWriter1 = new FileWriter("output.txt");
    fileWriter1.write(numeric + " ");
    fileWriter1.close();
  }

  public static int getNumeric(int scrA) {
    int count = 0;
    int sumDivisors = 0;
    int numeric = 0;
    for (int i = 1; i <= scrA; i++) {
      for (int j = 1; j <= scrA; j++) {

        if (i % j == 0) {
          count++;
        }
        if (count > sumDivisors) {
          numeric = i;
          sumDivisors = count;
        }
      }

      count = 0;
    }
    return numeric;
  }
}
