package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_51 {
  public static int[] parallelCellsQueues(int[] masX, int[] masY) {
    int[] masZ = new int[masX.length + masY.length];
    int k = 0;
    if (masX.length == masY.length) {
      for (int i = 0; i < masX.length; i++) {
        masZ[k] = masX[i];
        masZ[k + 1] = masY[i];
        k = k + 2;
      }
    }
    return masZ;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] massX = new int[5];
    int[] massY = new int[5];

    Tasks19_22.creatingArray(massX, x, y);
    Tasks19_22.creatingArray(massY, x, y);
    System.out.println(Arrays.toString(parallelCellsQueues(massX, massY)));
  }
}
