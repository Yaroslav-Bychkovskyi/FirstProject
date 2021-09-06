package com.github.YBychkovskyi.FirstProject;

public class Tasks19_67 {

  public static double mostDistant(int[] m) {

    int k = 0;
    double o;
    double[] arr = new double[m.length / 2];

    if (m.length % 2 == 0) {
      for (int i = 0; i < m.length; i = i + 2) {
        o = Math.sqrt(Math.pow(m[i], 2) + Math.pow(m[i + 1], 2));
        arr[k] = o;
        k++;
      }
    }

    return max(arr);

  }
  public static double max(double[] m) {
    double max = m[0];
    for (int i = 1; i < m.length; i++)
      if (m[i] > max)
        max = m[i];
    return max;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] mass = new int[6];

    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(mostDistant(mass));
  }
}
