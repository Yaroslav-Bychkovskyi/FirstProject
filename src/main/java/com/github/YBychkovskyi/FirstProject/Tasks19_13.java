package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks19_13 {

  public static void fillingArray(int[] mass, int x, int y) {
    for (int i = 0; i < mass.length; i++) {
      mass[i] = generate(x, y);

            while (!sumDigitsDividedNine(mass[i])) {
        mass[i] = generate(x, y);

      }

    }
    System.out.println();
    System.out.println(Arrays.toString(mass));
  }

  public static int generate(int x, int y) {
    return (x + (int) ((y - x + 1) * Math.random())) + 1;
  }

  public static boolean sumDigitsDividedNine(int mass) {

    if (mass % 9 == 0) {
      return true;
    }
    return false;
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = 10;
    int y = 99;
    System.out.println("Введіть довжину масива n - ");
    int n = scanner.nextInt();
    int mass[] = new int[n];
    fillingArray(mass, x, y);
  }
}
