package com.github.YBychkovskyi.FirstProject;

import java.util.Scanner;

public class Tasks3_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введіть а - ");
    int a = scanner.nextInt();

    System.out.println("Tasks2 - " + (a * 2.54));


    System.out.println("Введіть x - ");
    int x = scanner.nextInt();
    System.out.println("Введіть y - ");
    int y = scanner.nextInt();
    System.out.println("Введіть z - ");
    int z = scanner.nextInt();

    System.out.println("Tasks10 - " + ((x + y) / z));


  }

}
