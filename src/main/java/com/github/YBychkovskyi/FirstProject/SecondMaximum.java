package com.github.YBychkovskyi.FirstProject;

public class SecondMaximum {
  public static void main(String[] args) {
    int x = -99;
    int y = 99;
    int[] mass = new int[6];

    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(secondMaximum(mass));

  }

  public static int secondMaximum(int[] mass) {
    int max = mass[0];
    int max2 = mass[0];

    for (int i = 0; i < mass.length; i++) {
      if (mass[i] > max) {
        max = mass[i];
      }

    }
    for (int i = 0; i < mass.length; i++) {
      if (mass[i] < max && mass[i] > max2) {
        max2 = mass[i];
      }
    }
    System.out.println(max);
    //System.out.println(max2);
    return max2;
  }
}
