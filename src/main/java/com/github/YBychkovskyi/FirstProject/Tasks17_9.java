package com.github.YBychkovskyi.FirstProject;

public class Tasks17_9 {

  public static void evenNumbers(int a, int b) {
    for (int i = a; i < b; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }

  }

  public static void main(String[] args) {
    evenNumbers(2, 20);
  }
}
