package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_16 {

  public static void valueLatter(int[] mass, int x, int y) {

    int n = 0;
    for (int i = 0; i < mass.length; i++) {
      final var generate = Tasks19_13.generate(x, y);
      mass[i] = generate;
      mass[mass.length - 1 - n] = generate;
      n++;
    }
    System.out.println(Arrays.toString(mass));

  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int mass[] = new int[9];
    valueLatter(mass, x, y);
  }
}
