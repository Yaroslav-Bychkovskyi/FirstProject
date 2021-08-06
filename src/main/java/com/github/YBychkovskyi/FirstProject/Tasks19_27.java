package com.github.YBychkovskyi.FirstProject;

public class Tasks19_27 {

  public static int sumValues(int[] m, int k) {

    int sum = 0;
    for (int i = 0; i < k; i++) {
      sum += m[i];

    }
    return sum;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int mass[] = new int[6];
    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(sumValues(mass, 3));
  }
}
