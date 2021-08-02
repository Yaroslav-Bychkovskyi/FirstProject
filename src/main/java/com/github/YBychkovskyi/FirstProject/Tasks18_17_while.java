package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks18_17_while {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введіть довжину масива n - ");
    int n = scanner.nextInt();

    int[] mass = new int[n];
    int x = 100;
    int y = 999;

    for (int i = 0; i < mass.length; i++) {
      mass[i] = x + (int) ((y - x + 1) * Math.random());
    }
    System.out.println(Arrays.toString(mass));

    int i = 0;
    while (i < mass.length) {
      final var endIndex = mass.length - i - 1;

      if (i == endIndex) {
        System.out.println(mass[i]);

        break;

      }

      if (i - (endIndex) == 1) {
        break;
      }

      System.out.println(mass[i] + " " + mass[endIndex]);
      i++;
    }

  }
}
