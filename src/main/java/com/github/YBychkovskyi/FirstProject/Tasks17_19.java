package com.github.YBychkovskyi.FirstProject;

import java.util.Scanner;

public class Tasks17_19 {

  public static boolean equalLast(int a, int b) {

    int[] massA = Tasks17_16.leftDigit(a);
    int[] massB = Tasks17_16.leftDigit(b);

    if (massA[0] == massB[massB.length - 1]) {
      return true;
    } else return false;

  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введеть число a - ");
    int scrA = scanner.nextInt();

    System.out.println("Введеть число b - ");
    int scrB = scanner.nextInt();

    System.out.println(equalLast(scrA,scrB));
  }
}
