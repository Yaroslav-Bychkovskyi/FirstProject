package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_53 {
  public static int[] orderly(int[] a) {
    int[] b = new int[a.length];
    int k = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        b[k] = a[i];
        k++;
      }
    }
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 != 0) {
        b[k] = a[i];
        k++;
      }
    }
    return b;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] mass = new int[8];
    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(Arrays.toString(orderly(mass)));

  }
}
