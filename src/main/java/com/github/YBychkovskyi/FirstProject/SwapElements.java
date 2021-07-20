package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Random;

public class SwapElements {
  public static void main(String[] args) {
    int mass[] = new int[10];
    int min = 0;
    int max = 0;
    int b;

    Random rnd = new Random();
    for (int i = 0; i < mass.length; i++) {
      mass[i] = rnd.nextInt(100);
      if (mass[i] < mass[min]) min = i;
      if (mass[i] > mass[max]) max = i;
    }
    System.out.println(Arrays.toString(mass));
    System.out.println(min + " " + mass[min] + " " + max + " " + mass[max]);
    b = mass[min];
    mass[min] = mass[max];
    mass[max] = b;
    for (int i = 0; i < mass.length; i++)
      System.out.print(mass[i] + " ");


  }
}

