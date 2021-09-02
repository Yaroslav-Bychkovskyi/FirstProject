package com.github.YBychkovskyi.FirstProject;

public class Tasks19_62 {

  public static int[] parallelPairs(int[] masX, int[] masY) {
    int[] masZ = Tasks19_51.parallelCellsQueues(masX, masY);

    return drop(masZ);
  }

  public static int[] drop(int[] m){


    return null;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] massX = new int[7];
    int[] massY = new int[7];

    Tasks19_22.creatingArray(massX, x, y);
    Tasks19_22.creatingArray(massY, x, y);
  }
}
