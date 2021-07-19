package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Random;

public class PositiveElements {
  public static void main(String[] args) {
    int mass[] = new int[20];
    float sum = 0;
    int qty = 0;

    Random rnd = new Random();
    for (int i = 0; i < mass.length; i++) {
      mass[i] = rnd.nextInt(10) - 5;

      if (mass[i] > 0) {
        sum += mass[i];
        qty += 1;
      }

    }
    System.out.println(Arrays.toString(mass));
    System.out.println(sum / qty);
  }
}

