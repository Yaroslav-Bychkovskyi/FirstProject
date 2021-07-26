package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Random;

public class NonRepeatingElements {
  public static void main(String[] args) {
    int mass[] = new int[20];
    int f;

    Random rnd = new Random();
    for (int i = 0; i < mass.length; i++) {
      mass[i] = rnd.nextInt(15);
    }
    System.out.println(Arrays.toString(mass));

    for (int i = 0; i < mass.length; i++) {
      f = 1;
      for (int j = 0; j < mass.length; j++)

        if (mass[i] == mass[j] && i != j) {
          f = 0;
          break;
        }
      if (f == 1) System.out.print(mass[i] + " ");
    }
  }
}