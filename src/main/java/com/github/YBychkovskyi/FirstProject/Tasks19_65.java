package com.github.YBychkovskyi.FirstProject;

public class Tasks19_65 {

  public static boolean balancePoint(int[] m) {

    int sumX = m[0];
    int sumY = 0;
    int k = 1;

    for (int i = 2; i < m.length; i++) {
      sumY += m[i];
    }
    if (sumX == sumY) {
      System.out.println("Balance point " + m[1]);
      return true;
    }


    for (int i = 2 + k; i < m.length; i++) {
      sumX = sumX + m[k];
      sumY = sumY - m[k + 1];
      if (sumX == sumY) {

        System.out.println("Balance point " + m[k + 1]);
        return true;
      } else if (sumX < sumY) {
        k++;
      }
    }
    if (sumX > sumY) {
      return false;
    }
    return false;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] mass = new int[5];

    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(balancePoint(mass));
  }
}
