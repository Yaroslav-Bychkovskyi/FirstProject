package com.github.YBychkovskyi.FirstProject;


public class Tasks19_63 {

  public static int sumElem(int[] m, int k) {
    int sum = 0;
    for (int i = 0; i < k-1; i++) {
      sum += m[i];

    }
    return sum;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] mass = new int[5];

    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(sumElem(mass,3));
  }
}
