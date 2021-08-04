package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks19_14 {

  public static void tensEqualUnits(int[] mass, int x, int y) {

    int a = Tasks19_13.generate(x, y) % 10;

    for (int i = 0; i < mass.length; i++) {

      int newNumber = Tasks19_13.generate(x, y);

      mass[i] = newNumber / 10 * 10 + a;

      a = mass[i] / 10;
    }
    System.out.println(Arrays.toString(mass));

  }
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int x = 10;
    int y = 99;
    System.out.println("Введіть довжину масива n - ");
//    int n = scanner.nextInt();
    int mass[] = new int[8];
    tensEqualUnits(mass, x, y);

  }
}
