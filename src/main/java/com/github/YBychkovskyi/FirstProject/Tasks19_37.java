package com.github.YBychkovskyi.FirstProject;

public class Tasks19_37 {
  public static int serialNumber(int[] m) {
    int index = -1;
    for (int i = 0; i < m.length; i++) {
      if (m[i] == max(m)){
        index = i;
      }

    }
    return index;
  }

  public static int max(int[] m) {
    int max = m[0];
    for (int i = 1; i < m.length; i++)
      if (m[i] > max)
        max = m[i];
    return max;

  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] mass = new int[20];
    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(max(mass));
    System.out.println(serialNumber(mass));
  }
}
