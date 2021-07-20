package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Random;

public class ElementAndItsOrdinal {
  public static void main(String[] args) {
    int mass[] = new int[10];
    int max = 0;

    Random rnd = new Random();
    for (int i = 0; i < mass.length; i++) {
      mass[i] = rnd.nextInt(100);
      if (mass[i] > mass[max])
        max = i;
    }
    System.out.println(Arrays.toString(mass));

    System.out.println(max + " " + mass[max]);


  }
}

