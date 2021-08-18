package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Tasks19_47 {
  public static boolean arraysIdentical(int[] masX, int[] masY){


    return     Arrays.equals(masX, masY);

  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] massX = new int[5];
    int[] massY = new int[5];

    Tasks19_22.creatingArray(massX, x, y);
    Tasks19_22.creatingArray(massY, x, y);
    System.out.println(arraysIdentical(massX,massY));
  }
}
