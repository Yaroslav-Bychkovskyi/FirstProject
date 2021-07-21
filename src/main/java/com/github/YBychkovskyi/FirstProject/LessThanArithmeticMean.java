package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Random;

public class LessThanArithmeticMean {
  public static void main(String[] args) {
    int mass[] = new int[15];
    double sum = 0;
    double result;

    Random rnd = new Random();
    for (int i = 0; i < mass.length; i++) {
      mass[i] = rnd.nextInt(50);
      sum += mass[i];
    }
    System.out.println(Arrays.toString(mass));
    System.out.println(sum);

    result = sum / mass.length;
    System.out.println(result);

    for (int i = 0; i < mass.length; i++) {
      if (mass[i] < result)
        System.out.print(mass[i] + " ");

    }
  }
}
