package com.github.YBychkovskyi.FirstProject;

public class Tasks19_50 {
  public static int sameNumbers(int[] masX, int[] masY) {
    int count = 0;

    if (masX.length == masY.length) {
      for (int i = 0; i < masX.length; i++) {
        if (masX[i] == masY[i]) {
          count++;
        }
      }
    }

    return count;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] massX = new int[20];
    int[] massY = new int[20];

    Tasks19_22.creatingArray(massX, x, y);
    Tasks19_22.creatingArray(massY, x, y);
    System.out.println(sameNumbers(massX,massY));
  }
}
