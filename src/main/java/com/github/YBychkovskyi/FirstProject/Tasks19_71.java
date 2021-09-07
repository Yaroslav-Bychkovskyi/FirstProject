package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_71 {

  public static void main(String[] args) {
    int x = 1;
    int y = 99;
    int[] mass = new int[5];
    int n = 0;

    int a = (int) (Math.random() * y);
    mass[0] = a;

    for (int i = 1; i < mass.length; i++) {
      int b = Tasks19_13.generate(x, y);
      while (b != mass[i] + 1) {

        b = Tasks19_13.generate(x, y);
        n++;
        if (b == mass[i - 1] + 1) {
          mass[i] = b;

        }
      }
    }

    System.out.println(n);
    System.out.println(Arrays.toString(mass));


  }
}
