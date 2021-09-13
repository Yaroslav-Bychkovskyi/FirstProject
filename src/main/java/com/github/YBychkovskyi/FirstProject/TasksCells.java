package com.github.YBychkovskyi.FirstProject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TasksCells {
  public static void main(String[] args) throws IOException {

    int[] arrBlack = new int[]{1, 3, 5, 7};
    int[] arrWhite = new int[]{2, 4, 6, 8};

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

    if (x1 == x2 && y1 == y2) {
      fileWriter.write("YES");
    } else {
      if (x1 % 2 != 0 && y1 % 2 != 0) {
        if (comparison(x1, x2, arrBlack) && comparison(y1, y2, arrBlack)) {
          fileWriter.write("YES");
        } else fileWriter.write("NO");
      } else

      if (x1 % 2 == 0 && y1 % 2 == 0) {
        if (comparison(x1, x2, arrWhite) && comparison(y1, y2, arrWhite)) {
          fileWriter.write("YES");
        } else fileWriter.write("NO");
      }
    }


    fileWriter.close();


  }

  public static void validateCoordinate(int a) {
    if (a < 1 || a > 8) {
      System.out.println("Помилка");
      throw new RuntimeException("Runtime");

    }
  }

  public static boolean comparison(int a, int b, int[] m) {
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m.length; j++) {
        if (a == m[i] && b == m[j]) {
          return true;
        }
      }
    }
    return false;
  }
}
