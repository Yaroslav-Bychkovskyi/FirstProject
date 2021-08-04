package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_21 {
  public static void elementsNotRepeated(int[] mass, int x, int y) {

    int b = 0;

    for (int i = 0; i < mass.length; i++) {
      final var generate = Tasks19_13.generate(x, y);
      mass[i] = generate;

      while (audit(mass, )) {
        mass[i] = generate;
      }
  //    b = mass[i];

    }

    System.out.println(Arrays.toString(mass));
  }

  public static boolean audit(int[] mass, int c) {

    for (int i = 0; i < mass.length; i++) {
     // c = mass[i];
      if (c == mass[i]) {

        return true;
      }
    }
    return false;

  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int mass[] = new int[8];
    elementsNotRepeated(mass, x, y);
  }
}
