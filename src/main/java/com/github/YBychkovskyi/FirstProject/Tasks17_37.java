package com.github.YBychkovskyi.FirstProject;

import java.util.Scanner;

public class Tasks17_37 {
  public static double segmentLength(int x1, int y1, int x2, int y2) {

    return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введеть число x1 - ");
    int scrX1 = scanner.nextInt();

    System.out.println("Введеть число y1 - ");
    int scrY1 = scanner.nextInt();

    System.out.println("Введеть число x2 - ");
    int scrX2 = scanner.nextInt();

    System.out.println("Введеть число y2 - ");
    int scrY2 = scanner.nextInt();

    System.out.println(segmentLength(scrX1, scrY1, scrX2, scrY2));
  }
}
