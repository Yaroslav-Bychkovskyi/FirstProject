package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks17_10 {

  public static void sumDigits(final int a) {

    final var length = String.valueOf(a).length();

    System.out.println(length);

    int m = 1;

    for (int i = 1; i < length; i++) {
      m = m * 10;
    }
    //System.out.println(m);

    final var rozrad = m;


    int x, y = a;
    int r = rozrad;

    int mass[] = new int[String.valueOf(a).length()];

    for (int i = 0; i < String.valueOf(a).length(); i++) {
      x = y / r;
      y = a % r;
      mass[i] = x;
      r = r / 10;

    }

    System.out.println(Arrays.toString(mass));


    int sum = 0;

    for (int i = 0; i < mass.length; i++) {
      sum += mass[i];

    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введеть число - ");
    int scr = scanner.nextInt();

    sumDigits(scr);
  }
}
