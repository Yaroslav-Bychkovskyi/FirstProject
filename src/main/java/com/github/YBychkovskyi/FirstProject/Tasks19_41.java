package com.github.YBychkovskyi.FirstProject;

public class Tasks19_41 {
  public static void rearrangedHalves(int[] m) {

    for (int i = m.length - 1; i > 0; i--) {
      if (i == m.length / 2 - 1) {
        for (int j = 0; j < m.length / 2; j++) {
          System.out.print(m[j] + " ");
        }
        break;
      } else {

        System.out.print(m[i] + " ");
      }
    }
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] mass = new int[6];
    Tasks19_22.creatingArray(mass, x, y);
    rearrangedHalves(mass);
  }
}


