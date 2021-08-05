package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_22 {

  public static int numberCellsArray(int[] m, int X) {
    int n = 0;
    for (int i = 0; i < m.length; i++) {
      if (X == m[i]) {
        n++;
      }
    }
    return n;
  }

  public static void creatingArray(int[] m, int x, int y) {

    for (int i = 0; i < m.length; i++) {
      final var generate = Tasks19_13.generate(x, y);
      m[i] = generate;

    }

    System.out.println(Arrays.toString(m));
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int mass[] = new int[1000];

    creatingArray(mass, x, y);
    System.out.println(numberCellsArray(mass, 85));
  }
}
