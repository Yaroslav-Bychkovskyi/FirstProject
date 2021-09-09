package com.github.YBychkovskyi.FirstProject;

public class Tasks20_3 {

  public static void main(String[] args) {
    int x = 1;
    int y = 9999;
    int[] mass = new int[2000];
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;

    Tasks19_22.creatingArray(mass, x, y);

    for (int i = 0; i < mass.length; i++) {
      if (mass[i] < 10) {
        count1++;
      }
      if (mass[i] > 9 && mass[i] < 100) {
        count2++;
      }
      if (mass[i] > 99 && mass[i] < 1000) {
        count3++;
      }
      if (mass[i] > 999 && mass[i] < 10000) {
        count4++;
      }
    }
    System.out.println(count1);
    System.out.println(count2);
    System.out.println(count3);
    System.out.println(count4);
  }
}
