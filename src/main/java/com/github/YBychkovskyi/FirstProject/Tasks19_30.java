package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_30 {

  public static boolean orderedAscending(int[] m) {

    for (int i = 1; i < m.length; i++) {

      if (m[i] < m[i - 1]) {

        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int mass[] = new int[10];
    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(orderedAscending(mass));
  }
}
