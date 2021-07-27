package com.github.YBychkovskyi.FirstProject;

import java.util.Scanner;

public class Tasks17_15 {

  public static boolean primeNumber(int a) {

    final int b = 2;

    if (a > 1) {
      if (a % b != 0) {
        return true;
      }

    } else if (a % b == 0) {

    }
    return false;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введеть число a - ");
    int scrA = scanner.nextInt();

    System.out.println(primeNumber(scrA));

  }
}
