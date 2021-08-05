package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_21 {
  public static void elementsNotRepeated(int[] mass, int x, int y) {

    int c = 0;

    for (int i = 0; i < mass.length; i++) {
      var generate = Tasks19_13.generate(x, y);

      while (audit(mass, generate)) {
         c++;
        generate = Tasks19_13.generate(x, y);
      }
      mass[i] = generate;

    }

    System.out.println(Arrays.toString(mass));
    Arrays.sort(mass);
    System.out.println(Arrays.toString(mass));
    System.out.println(c);
  }

  public static boolean audit(int[] mass, int c) {

    for (int i = 0; i < mass.length; i++) {

      if (c == mass[i]) {

        return true;
      }
    }
    return false;

  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int mass[] = new int[9];
    elementsNotRepeated(mass, x, y);
  }
}
