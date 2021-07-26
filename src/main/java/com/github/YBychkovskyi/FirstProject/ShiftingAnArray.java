package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Random;

public class ShiftingAnArray {
  public static void main(String[] args) {
    int mass[] = new int[10];
    int qty = 0;

    Random rnd = new Random();
    for (int i = 0; i < mass.length; i++) {
      mass[i] = rnd.nextInt(50);
    }
    System.out.println(Arrays.toString(mass));

    for (int j = 0; j < mass.length; j++) {
      if (qty < 0) {
        for (int i = 0; i > mass.length - 1; i++)
          mass[i] = mass[i + 1];
        mass[mass.length - 1] = 0;
      } else {
        for (int i = mass.length - 1; i > 0; i--)
          mass[i] = mass[i - 1];
        mass[0] = 0;
      }
      for (int i = 0; i < mass.length; i++)
        System.out.print(mass[i] + " ");
      System.out.println("\n");
    }
  }
}

