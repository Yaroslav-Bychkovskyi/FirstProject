package com.github.YBychkovskyi.FirstProject;

public class Tasks19_25 {
  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int mass[] = new int[30];
    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(sumAdjacentCells(mass, 114));

  }

  public static boolean sumAdjacentCells(int[] m, int X) {
    for (int i = 0; i < m.length - 1; i++) {
      if (m[i] + m[i + 1] == X) {
        System.out.println(m[i] + " " + m[i + 1]);
        System.out.println(m[i] + m[i + 1]);
        return true;

      }

    }
    return false;
  }
}