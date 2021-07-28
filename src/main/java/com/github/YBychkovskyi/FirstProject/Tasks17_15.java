package com.github.YBychkovskyi.FirstProject;

import java.util.Scanner;

public class Tasks17_15 {

  public static boolean primeNumber(int a) {

    int b;
   System.out.println("Перевіряю на просте число: " + a);

    if (a == 0 || a == 1) {
      return false;
    }


    for (int i = 2; i < a - 1; i++) {
      b = a % i;

      if (b == 0) {
        return false;
      }

    }
    return true;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введеть число a - ");
    int scrA = scanner.nextInt();

    System.out.println(primeNumber(scrA));

  }
}
