package com.github.YBychkovskyi.FirstProject;

public class Tasks19_24 {

  public static boolean positiveNumbers(int[] m) {

    for (int i = 0; i < m.length; i++) {

      if (m[i] < 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {

    int x = 10;
    int y = 99;
    int mass[] = new int[10];
    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(positiveNumbers(mass));

  }
}
