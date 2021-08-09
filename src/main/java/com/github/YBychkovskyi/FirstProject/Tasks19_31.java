package com.github.YBychkovskyi.FirstProject;

public class Tasks19_31 {

  public static boolean sortedDescendingOrder(int[] m, int k) {

    boolean result = true;

    for (int i = 1; i < k; i++) {
      result = result && m[i] <= m[i - 1];
    }

    return result;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] mass = new int[10];
    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(sortedDescendingOrder(mass, 6));
  }
}




