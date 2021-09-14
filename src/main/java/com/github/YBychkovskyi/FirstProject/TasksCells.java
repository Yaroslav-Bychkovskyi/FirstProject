package com.github.YBychkovskyi.FirstProject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TasksCells {
  public static void main(String[] args) throws IOException {

    FileReader fr = new FileReader("input.txt");
    Scanner scanner = new Scanner(fr);
    int x1 = scanner.nextInt();
    int x2 = scanner.nextInt();
    int y1 = scanner.nextInt();
    int y2 = scanner.nextInt();

    FileWriter fileWriter = new FileWriter("output.txt");

    validateCoordinate(x1);
    validateCoordinate(x2);
    validateCoordinate(y1);
    validateCoordinate(y2);


    if (comparison(x1, x2) == comparison(y1, y2)) {
      fileWriter.write("YES");
    } else fileWriter.write("NO");

    fileWriter.close();


  }

  public static void validateCoordinate(int a) {
    if (a < 1 || a > 8) {
      System.out.println("Помилка");
      throw new RuntimeException("Runtime");

    }
  }

  public static int comparison(int a, int b) {
    return (a + b) % 2;
  }
}
