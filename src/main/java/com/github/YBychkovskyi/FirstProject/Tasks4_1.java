package com.github.YBychkovskyi.FirstProject;

import java.util.Scanner;

public class Tasks4_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введіть двохзначне число x - ");
    int x = scanner.nextInt();

    System.out.println("Tasks1 - " + x / 10 + " " + x % 10);


    System.out.println("Введіть трьох значне число y - ");
    int y = scanner.nextInt();

    System.out.println("Tasks2 - " + y / 100 + " " + (y % 100) / 10 + " " + y % 10);

    int a, b;
    a = x / 10;
    b = x % 10;
    System.out.println("Tasks3 - " + b + " " + a);


    int q, w;
    q = x % 10;
    w = x - q;
    System.out.println("Tasks5 - " + w + " + " + q);


    int r, t, u, i;
    r = y % 100;
    t = y - r;
    u = r % 10;
    i = r - u;

    System.out.println("Tasks6 - " + t + " + " + i + " + " + u);

    int s, d, f, g;
    s = y / 100;
    d = (y % 100) / 10;
    f = y % 10;
    g = (f * 100 + d * 10 + s) - 20;

    System.out.println("Tasks8 - " + g);

    System.out.println("Tasks9 - " + (a + b));

    System.out.println("Tasks11 - " + (a - b));

    System.out.println("Tasks12 - " + (s - (f * d)));


    int h = 0;
    if (a % 2 == 0) {
      h++;
    }
    if (b % 2 == 0) {
      h++;
    }
    System.out.println("Tasks13 - " + h);


    System.out.println("Введіть чотирьох значне число n - ");

    int n = scanner.nextInt();
    int qw, we, er, rt;
    int o = 0;

    qw = n / 1000;
    we = (n % 1000) / 100;
    er = ((n % 1000) % 100) / 10;
    rt = ((n % 1000) % 100) % 10;

    if (qw % 2 == 0) {
      o++;
    }
    if (we % 2 == 0) {
      o++;
    }
    if (er % 2 == 0) {
      o++;
    }
    if (rt % 2 == 0) {
      o++;
    }

    System.out.println("Tasks15 - " + qw + " " + we + " " + er + " " + rt);
    System.out.println("Tasks15 - " + o);
  }
}
