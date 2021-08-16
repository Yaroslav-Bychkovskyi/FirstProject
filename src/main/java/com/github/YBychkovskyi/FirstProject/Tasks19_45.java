package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_45 {

  public static int[] shiftRight(int[] m) {
    int x = m[m.length - 1];
    for (int i = m.length - 2; i >= 0; i--) {
      m[i + 1] = m[i];
    }
    m[0] = x;
    return m;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] mass = new int[7];
    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(Arrays.toString(shiftRight(mass)));
  }
}
