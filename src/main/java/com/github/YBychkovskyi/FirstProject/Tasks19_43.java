package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_43 {
  public static int[] noRepetitionsValues(int[] masX, int[] masY) {
    Arrays.sort(masX);
    Arrays.sort(masY);

    int[] masZ = Tasks19_42.ascendingOrder(masX, masY);
    return removeElement(masZ);

  }

  public static int[] removeElement(int[] mass) {

    Integer[] m = new Integer[mass.length];
    for (int i = 0; i < mass.length; i++) {
      m[i] = mass[i];
    }

    int count = 0;

    for (int i = 0; i < m.length; i++) {
      for (int j = i + 1; j < m.length; j++) {

        if (m[i] != null && m[i].equals(m[j])) {
          System.out.println(m[j]);
          m[j] = null;
        }
      }
    }


    for (Integer integer : m) {
      if (integer == null) {
        count++;
      }
    }

    int a = 0;
    int[] arr = new int[m.length - count];
    for (int i = 0; i < m.length; i++) {
      if (m[i] != null) {
        arr[a] = m[i];
        a++;
      }
    }
    System.out.println("arr - ");
    System.out.println(Arrays.toString(arr));

    return arr;

  }


  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] massX = new int[20];
    int[] massY = new int[20];

    Tasks19_22.creatingArray(massX, x, y);
    Tasks19_22.creatingArray(massY, x, y);
    noRepetitionsValues(massX, massY);
  }
}

