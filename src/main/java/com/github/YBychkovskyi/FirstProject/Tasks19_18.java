package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_18 {
  public static void nonDecreasingSequence(int[] mass, int x, int y) {

    int b = x;

    for (int i = 0; i < mass.length; i++) {
      final var generate = Tasks19_13.generate(b, y);
      mass[i] = generate;

      b = mass[i];

    }

    System.out.println(Arrays.toString(mass));
  }

  public static void main(String[] args) {
    int x = 100;
    int y = 999;
    int mass[] = new int[8];
    nonDecreasingSequence(mass, x, y);
  }
}
