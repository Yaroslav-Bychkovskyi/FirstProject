package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_61 {


  public static int[] onlyOnce(int[] mass) {

    Integer[] m = new Integer[mass.length];
    for (int i = 0; i < mass.length; i++) {
      m[i] = mass[i];
    }

    int count = 0;

    for (int i = 0; i < m.length; i++) {
      for (int j = i + 1; j < m.length; j++) {
        if (m[i] != null && m[i].equals(m[j])) {
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

    return arr;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] mass = new int[8];
    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(Arrays.toString(onlyOnce(mass)));
  }
}
