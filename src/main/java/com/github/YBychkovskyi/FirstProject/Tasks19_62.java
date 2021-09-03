package com.github.YBychkovskyi.FirstProject;


import java.util.Arrays;

public class Tasks19_62 {

  public static int[] parallelPairs(int[] masX, int[] masY) {


    Integer[] mX = new Integer[masX.length];
    for (int i = 0; i < masX.length; i++) {
      mX[i] = masX[i];
    }

    Integer[] mY = new Integer[masY.length];
    for (int i = 0; i < masY.length; i++) {
      mY[i] = masY[i];
    }

    if (masX.length == masY.length) {
      for (int i = 0; i < mX.length; i++) {
        if (!mX[i].equals(mY[i])) {
          mX[i] = null;

        }
      }
    }

    int count = 0;

    for (Integer integer : mX) {
      if (integer == null) {
        count++;
      }
    }

    int a = 0;
    int[] arr = new int[masX.length - count];
    for (int i = 0; i < masX.length; i++) {
      if (mX[i] != null) {
        arr[a] = masX[i];
        a++;
      }
    }
    System.out.println("arr - ");

    return arr;
  }


  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] massX = new int[7];
    int[] massY = new int[7];

    Tasks19_22.creatingArray(massX, x, y);
    Tasks19_22.creatingArray(massY, x, y);

    System.out.println(Arrays.toString(parallelPairs(massX, massY)));
  }
}
