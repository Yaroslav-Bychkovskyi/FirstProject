package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_43 {
  public static int[] noRepetitionsValues(int[] masX, int[] masY) {
    Arrays.sort(masX);
    Arrays.sort(masY);

    Tasks19_42.ascendingOrder(masX, masY);

    return null;
  }

  public static int[] removeElement(int[] m) {
    for (int i = 0; i < m.length; i++) {
      for (int j = i + 1; j < m.length; j++) {

        if (m[i] == m[j]) {


        }
      }

    }
    return null;
  }


  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] massX = new int[5];
    int[] massY = new int[5];

    Tasks19_22.creatingArray(massX, x, y);
    Tasks19_22.creatingArray(massY, x, y);
  }
}

