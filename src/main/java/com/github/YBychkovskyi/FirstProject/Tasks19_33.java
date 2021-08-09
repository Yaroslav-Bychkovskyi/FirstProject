package com.github.YBychkovskyi.FirstProject;

public class Tasks19_33 {

  public static int sumElements(int[] m) {
    int sum = 0;
    for (int i = 0; i < m.length; i++) {
      sum += m[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] mass = new int[10];
    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(sumElements(mass));
  }
}
