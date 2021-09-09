package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks20_2 {

  public static int[] arrayParameter(int[] mass) {
    int[] arr = new int[3];
    int sum = 0;
    int min = 0;
    int count = 0;
    for (int i = 0; i < mass.length; i++) {

      if (mass[i] > 0) {
        sum += mass[i];
        arr[0] = sum;
      }
      if (mass[i] < 0) {
        min += mass[i];
        arr[1] = min;
      }
      if (mass[i] ==0){
        count++;
        arr[2] = count;
      }

    }

    return arr;
  }

  public static void main(String[] args) {
    int x = -99;
    int y = 99;
    int[] mass = new int[100];

    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(Arrays.toString(arrayParameter(mass)));

  }
}
