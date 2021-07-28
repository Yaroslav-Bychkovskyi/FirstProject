package com.github.YBychkovskyi.FirstProject;

import java.util.Scanner;

public class Tasks17_38 {

  public static int coordinateSystems(int x, int y) {

    if (x < 0 && y > 0) {
      return 2;
    }
    if (x > 0 && y > 0) {
      return 1;
    }
    if (x > 0 && y < 0) {
      return 4;
    }
    if (x < 0 && y < 0) {
      return 3;
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введеть число x - ");
    int scrX = scanner.nextInt();

    System.out.println("Введеть число y - ");
    int scrY = scanner.nextInt();

    System.out.println(coordinateSystems(scrX, scrY));
  }
}
