package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Random;

public class MaximumNegativeElement {
  public static void main(String[] args) {
    int mass[] = new int[15];
    int index = -1;

    Random rnd = new Random();
    for (int i = 0; i < mass.length; i++) {
      mass[i] = rnd.nextInt(100) - 50;

    }
    System.out.println(Arrays.toString(mass));

    for (int i = 0; i < mass.length; i++) {
      if (mass[i] < 0 && index == -1)
        index = i;
      else if (mass[i] < 0 && mass[i] > mass[index])
        index = i;
    }
    System.out.println( mass[index]);
    System.out.println( index);
  }
}

