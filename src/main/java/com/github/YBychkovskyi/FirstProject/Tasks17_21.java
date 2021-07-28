package com.github.YBychkovskyi.FirstProject;

import java.util.Scanner;

public class Tasks17_21 {

  public static double pointDistance(int x, int y) {
    return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введеть число x - ");
    int scrX = scanner.nextInt();

    System.out.println("Введеть число y - ");
    int scrY = scanner.nextInt();

    System.out.println(pointDistance(scrX, scrY));
  }
}
