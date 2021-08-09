package com.github.YBychkovskyi.FirstProject;

public class Tasks19_35 {
  public static boolean equalNumber(int[] m) {
    int mid = Tasks19_34.arithmeticMean(m);
    System.out.println(mid);


    return mid == m.length / 2;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] mass = new int[9];
    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(equalNumber(mass));
  }
}
