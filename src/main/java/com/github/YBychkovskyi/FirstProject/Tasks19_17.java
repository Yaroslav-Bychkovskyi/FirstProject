package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_17 {
  public static void wereIdentical(int[] mass, int x, int y) {
    int m = 0;
    int n;

    if (mass.length % 2 == 0) {
      n = mass.length / 2;

    } else {
      n = mass.length / 2 + 1;
    }

    for( int i = 0; i < n; i++) {
      final var generate = Tasks19_13.generate(x, y);
      mass[i] = generate;
      if (n + m != mass.length) {
        mass[n + m] = generate;
      }
      m++;
    }
    System.out.println(Arrays.toString(mass));
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int mass[] = new int[8];
    wereIdentical(mass, x, y);
  }
}
