package com.github.YBychkovskyi.FirstProject;

import java.io.IOException;
import java.util.Scanner;

public class TasksEven11 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введеть число n - ");
    String input = "input.txt";
    String output = "output.txt";

    int n = scanner.nextInt();
    if (n < 0 || n > 100) {
      System.out.println("Помилка");
      throw new RuntimeException("Runtime");
    }

    int x = 1;
    int y = 100;
    int a;

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(n).append("\n");
    for (int i = 0; i < n; i++) {
      a = (int) (Math.random() * (y - x)) + x;
      stringBuilder.append(a).append(" ");
    }

    TasksWriteReader.writer(input, stringBuilder.toString());

    int[] mass = TasksMaximum10.getInts(input, n, stringBuilder);

    int count = getCount(mass);

    TasksWriteReader.writer(output, count + " ");

  }

  public static int getCount(int[] mass) {
    int count = 0;
    for (int i = 0; i < mass.length; i++) {
      if (mass[i] % 2 == 0 && i % 2 == 0) {
        count++;
      }
    }
    return count;
  }
}
