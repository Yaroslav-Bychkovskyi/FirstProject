package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Random;

public class PositiveAndNegativeNumbers {
  public static void main(String[] args) {
    int mass[] = new int[10];
    int dod = 0;
    int vid = 0;

    Random rnd = new Random();
    for (int i = 0; i < mass.length; i++) {
      mass[i] = rnd.nextInt(10000) - 5000;
    }
    System.out.println(Arrays.toString(mass));

    for (int i = 0; i < mass.length; i++) {
      if (mass[i] > 0) {
        dod++;
      }

      if (mass[i] < 0) {
        vid++;
      }
    }

    int b = 0;
    int a = 0;

    int massPos[] = new int[dod];
    int massNeg[] = new int[vid];

    for (int i = 0; i < mass.length; i++) {
      if (mass[i] > 0) {
        massPos[b] = mass[i];
        b++;
      }
      if (mass[i] < 0) {
        massNeg[a] = mass[i];
        a++;
      }
    }
    System.out.println(Arrays.toString(massPos));
    System.out.println(Arrays.toString(massNeg));

  }
}
