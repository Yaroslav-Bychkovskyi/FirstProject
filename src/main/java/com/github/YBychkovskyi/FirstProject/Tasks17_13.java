package com.github.YBychkovskyi.FirstProject;

import java.util.Scanner;

public class Tasks17_13 {

  public static boolean sameNumber(int a, int b) {

    final var lengthA = String.valueOf(a).length();
    final var lengthB = String.valueOf(b).length();

    if (lengthA == lengthB) {
      return true;
    } else return false;
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Введеть число a - ");
    int scrA = scanner.nextInt();

    System.out.println("Введеть число b - ");
    int scrB = scanner.nextInt();


    System.out.println(sameNumber(scrA,scrB));

  }

}
