package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_39 {
  public static void flipsArray(int[] m) {
    int[] newM = new int[m.length];
    int j = m.length - 1;
    for (int i = 0; i < m.length; i++) {
      newM[j] = m[i];
      j--;
    }
    System.out.println(Arrays.toString(newM));

  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] mass = new int[5];
    Tasks19_22.creatingArray(mass, x, y);
    flipsArray(mass);
  }
}
