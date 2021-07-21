package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Random;

public class SumElementsMinimumMaximum {
  public static void main(String[] args) {

    int mass[] = new int[10];
    int sum = 0;
    int min = 0;
    int max = 0;

    Random rnd = new Random();
    for (int i = 0; i < mass.length; i++) {
      mass[i] = rnd.nextInt(50)-20;
    }
    System.out.println(Arrays.toString(mass));

    for (int i = 0; i < mass.length; i++) {
      if
      (mass[i] < mass[min]) {
        min = i;
      } else if (mass[i] > mass[max]) {
        max = i;
      }
    }
    System.out.println(mass[min] + " " + mass[max]);


    int start = Math.min(min, max);
    int end = Math.max(min, max);

    for (int i = start + 1; i < end; i++) {
      sum += mass[i];
    }
    System.out.println(sum);
  }
}