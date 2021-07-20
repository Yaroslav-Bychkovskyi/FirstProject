package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Random;

public class MostCommon {
  public static void main(String[] args) {
    int mass[] = new int[20];
    int num = mass[0];
    int frq;
    int max_frq = 1;

    Random rnd = new Random();
    for (int i = 0; i < mass.length; i++) {
      mass[i] = rnd.nextInt(50);
    }
    System.out.println(Arrays.toString(mass));


    for (int i = 0; i < mass.length - 1; i++) {
      frq = 1;
      for (int j = i + 1; j < mass.length; j++)
        if (mass[i] == mass[j])
          frq += 1;
      if (frq > max_frq) {
        max_frq = frq;
        num = mass[i];
      }
    }

    if (max_frq > 1)
      System.out.println(max_frq + " " + num);
    else System.out.println("елементи унікальні");
  }
}

