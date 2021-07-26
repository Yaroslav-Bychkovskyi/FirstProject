package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Random;

public class MoreModuloMaximum {
  public static void main(String[] args) {
    int mass[] = new int[20];
    int max = -16;
    int count = 0;

    Random rnd = new Random();
    for (int i = 0; i < mass.length; i++) {
      mass[i] = rnd.nextInt(30) - 15;
//      System.out.println("mass[" + i + "]=" + mass[i]);
      if (mass[i] > max) max = mass[i];
    }
    System.out.println("Числа в массиве сгенерированы.");
    System.out.println(Arrays.toString(mass));


    for (int j = 0; j < mass.length; j++) {
      if (Math.abs(mass[j])>max) count += 1;
    }
    System.out.println(count);

  }
}
