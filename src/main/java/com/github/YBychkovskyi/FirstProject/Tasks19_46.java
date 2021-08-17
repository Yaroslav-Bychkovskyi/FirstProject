package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_46 {
  public static int[] shifts(int[] m, int k) {


    if (k < 0) {
      k = k * (-1);
      int[] mas = new int[k];

      for (int i = 0; i < k; i++) {
        mas[i] = m[i];
      }

      for (int i = k; i < m.length; i++) {
        m[i - k] = m[i];
      }

      int j = 0;
      for (int i = m.length - k; i < m.length; i++) {
        m[i] = mas[j];
        j++;


      }


    } else if (k > 0) {

      int[] mas = new int[k];

      int x = 0;
      for (int i = m.length - k; i < m.length; i++) {
        mas[x] = m[i];
        x++;
      }

      for (int j = m.length - 1 - k; j >= 0; j--) {
        m[j + k] = m[j];
      }
      for (int i = 0; i < k; i++) {
        m[i] = mas[i];
      }

    }
    return m;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] mass = new int[7];
    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(Arrays.toString(shifts(mass, 2)));
  }
}
