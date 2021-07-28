package com.github.YBychkovskyi.FirstProject;

import java.util.Scanner;

public class Tasks17_22 {

  public static boolean oneRoot(int a, int b, int c) {

    double D = Math.pow(b, 2) - 4 * a * c;

    if (D == 0) {
      return true;
    }
    if (D > 0) {
      return true;

    } else if (D < 0) {

    }
    return false;

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введеть число a - ");
    int scrA = scanner.nextInt();

    System.out.println("Введеть число b - ");
    int scrB = scanner.nextInt();

    System.out.println("Введеть число c - ");
    int scrC = scanner.nextInt();

    System.out.println(oneRoot(scrA, scrB, scrC));
  }
}
