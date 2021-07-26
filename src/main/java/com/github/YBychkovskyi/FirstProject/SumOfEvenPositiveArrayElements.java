package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Random;

public class SumOfEvenPositiveArrayElements {
  public static void main(String[] args) {

    int mass[] = new int[10];
    int sum = 0;


    Random rnd = new Random();
    for (int i = 0; i < mass.length; i++) {
      mass[i] = rnd.nextInt(20) - 10;
    }
    System.out.println(Arrays.toString(mass));

    for (int i = 0; i < mass.length; i++) {
      if (mass[i]> 0 && mass[i] % 2 == 0)
        sum += mass[i];
    }
    System.out.println(sum);
  }
}
