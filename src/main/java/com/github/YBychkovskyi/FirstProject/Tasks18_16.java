package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks18_16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введіть довжину масива n - ");
    int n = scanner.nextInt();

    int[] mass = new int[n];
    int x = 10;
    int y = 99;

    for (int i = 0; i < mass.length; i++) {
      mass[i] = x + (int) ((y - x + 1) * Math.random());
    }
    System.out.println(Arrays.toString(mass));

    for (int i = 0; i < mass.length; i++) {
      if (mass[i] % 2 == 0) {
        System.out.print(mass[i] + " ");
      }
    }
    System.out.println();

    for (int i = 0; i < mass.length; i++) {
      if (mass[i] % 2 != 0) {
        System.out.print(mass[i] + " ");
      }
    }

  }
}
