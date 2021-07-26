package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Random;

public class OccursMostOften {
  public static void main(String[] args) {
    int mass[] = new int[20];
    int k, frq;
    int num = mass[0];
    int max_frq = 1;

    Random rnd = new Random();
    for (int i = 0; i < mass.length; i++) {
      mass[i] = rnd.nextInt(50);
    }
    System.out.println(Arrays.toString(mass));


    for (int i = 0; i < mass.length - 1; i++) {
      frq = 1;
      for (k = i + 1; k < mass.length; k++)
        if (mass[i] == mass[k])
          frq += 1;
      if (frq > max_frq) {
        max_frq = frq;
        num = mass[i];
      }
    }

    if (max_frq > 1) {
      System.out.println(max_frq + " " + num);
    } else System.out.println("елементи унікальні");

  }
}
