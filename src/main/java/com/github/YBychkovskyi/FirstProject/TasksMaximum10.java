package com.github.YBychkovskyi.FirstProject;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TasksMaximum10 {
  public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введеть число N - ");
    String input = "input.txt";

    int N = scanner.nextInt();
    if (N < 0 || N > 10000) {
      System.out.println("Помилка");
      throw new RuntimeException("Runtime");
    }


    int x = 1;
    int y = 10000;
    int[] mass = new int[N];

    Tasks19_22.creatingArray(mass, x, y);

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(N + "\n");
    stringBuilder.append(Arrays.toString(mass));
    TasksWriteReader.writer(input, stringBuilder.toString());


  }
}
