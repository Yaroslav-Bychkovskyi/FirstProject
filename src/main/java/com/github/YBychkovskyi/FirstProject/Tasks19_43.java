package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_43 {
  public static int[] noRepetitionsValues(int[] masX, int[] masY) {
    Arrays.sort(masX);
    Arrays.sort(masY);

    int[] masZ = Tasks19_42.ascendingOrder(masX, masY);

    removeElement(masZ);
    return masZ;
  }

  public static boolean itemSearch(int[] m, int n) {

    for (int j : m) {
      if (n == j) {
        return true;
      }
    }
    return false;
  }

  public static void removeElement(int[] mass) {

    Integer[] m = new Integer[mass.length];
    for (int i = 0; i < mass.length; i++) {
      m[i] = mass[i];
    }


    for (int i = 0; i < m.length; i++) {
      for (int j = i + 1; j < m.length; j++) {

        if (m[i] == m[j]) {
          m[j] = null;
        }
      }
    }

    int count = 0;
    for (Integer integer : m) {
      if (integer == null) {
        count++;
      }
    }
    System.out.println(count);


    int[] arr = new int[m.length - count];
    for (int i = 0; i < m.length; i++) {
      if (m[i] != null) {
        arr[i] = m[i];
      }
    }

  }


  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] massX = new int[5];
    int[] massY = new int[5];

    Tasks19_22.creatingArray(massX, x, y);
    Tasks19_22.creatingArray(massY, x, y);
    System.out.println(Arrays.toString(noRepetitionsValues(massX, massY)));
  }
}

