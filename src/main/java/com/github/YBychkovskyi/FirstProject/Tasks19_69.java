package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_69 {

  public static double[] circleRadius(int[] m, int r) {

    double o;
    int a = 0;
    int b = 0;


    double[] mass = new double[m.length / 2];
    if (m.length % 2 == 0) {
      for (int i = 0; i < m.length; i = i + 2) {
        o = Math.sqrt(Math.pow(m[i], 2) + Math.pow(m[i + 1], 2));
        if (o < r) {
          b++;
          mass[a] = o;
          a++;


        }
      }
    }
    double[] arr = new double[b];
    int x = 0;
    for (int i = 0; i < b; i++) {
      if (mass[i] != 0) {
        arr[x] = mass[i];
        x++;
      }

    }

    return arr;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] mass = new int[6];

    Tasks19_22.creatingArray(mass, x, y);

    System.out.println(Arrays.toString(circleRadius(mass, 100)));

  }
}
