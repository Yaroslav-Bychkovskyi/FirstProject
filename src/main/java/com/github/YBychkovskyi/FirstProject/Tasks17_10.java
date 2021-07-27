package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks17_10 {

  public static int sumDigits(final int a) {

    int mass[] = Tasks17_16.leftDigit(a);

    System.out.println(Arrays.toString(mass));

    int sum = 0;

    for (int i = 0; i < mass.length; i++) {
      sum += mass[i];

    }
    System.out.println(sum);
    return sum;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введеть число - ");
    int scr = scanner.nextInt();

    sumDigits(scr);
  }
}
