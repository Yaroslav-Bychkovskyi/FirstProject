package com.github.YBychkovskyi.FirstProject;

public class Tasks19_34 {
  public static int arithmeticMean(int[] m) {
    int sum = Tasks19_33.sumElements(m);
    System.out.println(sum);
    int average = sum / m.length;
    System.out.println(average);
    int number = 0;

    for (int i = 0; i < m.length; i++) {
      if (average < m[i]) {
        number++;
      }
    }
    return number;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] mass = new int[9];
    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(arithmeticMean(mass));
  }
}
