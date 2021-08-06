package com.github.YBychkovskyi.FirstProject;

public class Tasks19_29 {

  public static int sumCellValues(int[] m, int k, int t) {

    int sum = 0;

    for (int i = k; i < t; i++) {
      sum += m[i];
    }

    return sum;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int mass[] = new int[10];
    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(sumCellValues(mass, 5, 7));
  }
}
