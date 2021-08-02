package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks18_14 {
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

    for (int i = 0; i < mass.length / 2 + 1; i++) {
      System.out.print(mass[i] + " ");
    }
    System.out.println();

    for (int i = mass.length / 2 + 1; i < mass.length; i++) {
      System.out.print(mass[i] + " ");
    }
  }

}
