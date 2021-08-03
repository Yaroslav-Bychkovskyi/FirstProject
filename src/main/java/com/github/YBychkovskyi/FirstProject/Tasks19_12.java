package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks19_12 {

  public static void randomNumbers(int[] mass, int x, int y) {

    for (int i = 0; i < mass.length; i++) {

      mass[i] = (x + (int) ((y - x + 1) * Math.random())) + 1;

      int massX[] = Tasks17_16.leftDigit(mass[i]);

      System.out.print(Arrays.toString(massX) + " ");

      if (massX[0] > massX[1]) {

      } else {
        mass[i] = massX[1] * 10 + massX[0];
      }

    }

    System.out.println();
    System.out.println(Arrays.toString(mass));

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = 10;
    int y = 99;
    System.out.println("Введіть довжину масива n - ");
    int n = scanner.nextInt();
    int mass[] = new int[n];
    randomNumbers(mass, x, y);
  }
}
