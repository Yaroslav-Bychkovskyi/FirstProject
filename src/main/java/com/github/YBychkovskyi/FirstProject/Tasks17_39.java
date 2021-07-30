package com.github.YBychkovskyi.FirstProject;

import java.util.Scanner;

public class Tasks17_39 {

  public static boolean segmentIntersects(int x1, int y1, int x2, int y2) {

    if (x1 > 0 && x2 > 0) {
      if (y1 > 0 && y2 > 0) {
        return false;
      }
    }
    if (x1 < 0 && x2 < 0) {
      if (y1 < 0 && y2 < 0) {
        return false;
      }
    }
    if (x1 > 0 && x2 > 0) {
      if (y1 < 0 && y2 < 0) {
        return false;
      }
    }
    if (x1 < 0 && x2 < 0) {
      if (y1 > 0 && y2 > 0) {
        return false;
      }
    }


    return true;
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

    System.out.println(segmentIntersects(scrX1, scrY1, scrX2, scrY2));
  }
}
