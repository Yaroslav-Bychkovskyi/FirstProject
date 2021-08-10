package com.github.YBychkovskyi.FirstProject;

public class Tasks19_38 {
  public static void containingMaximumValue(int[] m) {
    int index = -1;
    final var max = Tasks19_37.max(m);
    for (int i = 0; i < m.length; i++) {

      if (m[i] == max) {
        index = i;
        System.out.print(index + " ");
      }
    }
  }

  public static void main(String[] args) {
    int x = 1;
    int y = 9;
    int[] mass = new int[30];
    Tasks19_22.creatingArray(mass, x, y);
    containingMaximumValue(mass);
  }
}
