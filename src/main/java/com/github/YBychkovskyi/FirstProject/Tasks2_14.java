package com.github.YBychkovskyi.FirstProject;

import java.util.Scanner;

public class Tasks2_14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введіть а - ");
    int a = scanner.nextInt();

    System.out.println("Tasks14 - " + (a + 10));

    System.out.println("Tasks15 - " + (a * 10));

    System.out.println("Tasks16 - " + (a + 6));
    System.out.println("Tasks16 - " + (a - 12));

    System.out.println("Tasks17 - " + Math.pow(a, 2));

    System.out.println("Tasks18 - " + Math.pow(a, 2) + " & " + Math.pow(a, 3));

    System.out.println("Tasks20 - " + a + " " + (a - (a * 2)));

    System.out.println("Tasks21 - " + (a + 1));
    System.out.println("Tasks21 - " + (a + 2));
    System.out.println("Tasks21 - " + (a + 3));

    System.out.println("Введіть b - ");
    int b = scanner.nextInt();

    System.out.println("Tasks22 - " + (a + b));
    System.out.println("Tasks22 - " + (a * b));
    System.out.println("Tasks22 - " + (a - b));
    System.out.println("Tasks22 - " + (b - a));

    System.out.println("Tasks24 - " + (a * b));
    System.out.println("Tasks24 - " + ((a + b) * 2));


    System.out.println("Введіть c - ");
    double c = scanner.nextDouble();

    System.out.println("Tasks25 - " + (a * b * c));
    System.out.println("Tasks25 - " + (a * b) + " " + (a * c) + " " + (b * c));

    System.out.println("Tasks27 - " + c + " грам " + (c / 1000) + " кілоглам");


  }
}
