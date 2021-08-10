package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_42 {

  public static int[] ascendingOrder(int[] masX, int[] masY) {
    int[] masZ = new int[masX.length + masY.length];
    int count = 0;
    for (int i = 0; i < masX.length; i++) {
      masZ[i] = masX[i];
      count++;
    }
    for (int j = 0; j < masY.length; j++) {
      masZ[count++] = masY[j];
    }
    Arrays.sort(masZ);
    return masZ;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] massX = new int[5];
    int[] massY = new int[5];

    Tasks19_22.creatingArray(massX, x, y);
    Tasks19_22.creatingArray(massY, x, y);
    System.out.println(Arrays.toString(ascendingOrder(massX,massY)));
  }
}

