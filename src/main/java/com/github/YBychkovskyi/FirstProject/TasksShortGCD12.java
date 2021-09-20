package com.github.YBychkovskyi.FirstProject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TasksShortGCD12 {
  public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введеть число n - ");
    String input = "input.txt";
    String output = "output.txt";

    int n = scanner.nextInt();
    if (n < 0 || n > 30000) {
      System.out.println("Помилка");
      throw new RuntimeException("Runtime");
    }

    System.out.println("Введеть число m - ");
    int m = scanner.nextInt();
    if (m < 0 || m > 30000) {
      System.out.println("Помилка");
      throw new RuntimeException("Runtime");
    }

    TasksWriteReader.writer(input, n + " " + m);

    extracted(n);
    extracted(m);




  }



  private static void extracted(int m) {
    ArrayList<Integer> mas = new ArrayList<>();
    for (int i = 1; i < m; i++) {
      if (m % i == 0) {
        mas.add(i);
      }
    }
    System.out.println(mas);
  }
}
