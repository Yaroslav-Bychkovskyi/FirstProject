package com.github.YBychkovskyi.FirstProject;

public class Tasks19_70 {
  public static boolean complete(int[] mass) {

    int n = 0;
    for (int i = 0; i < mass.length; i++) {
      n++;
      if (mass[i] != n) {
        return false;

      }
    }
    return true;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] mass = new int[6];

    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(complete(mass));
  }
}
