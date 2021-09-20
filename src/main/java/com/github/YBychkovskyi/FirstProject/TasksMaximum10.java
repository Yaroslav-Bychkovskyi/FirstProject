package com.github.YBychkovskyi.FirstProject;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TasksMaximum10 {
  public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введеть число N - ");
    String input = "input.txt";
    String output = "output.txt";

    int N = scanner.nextInt();
    if (N < 0 || N > 10000) {
      System.out.println("Помилка");
      throw new RuntimeException("Runtime");
    }

    int x = 1;
    int y = 10000;
    int a;

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(N).append("\n");
    for (int i = 0; i < N; i++) {
      a = (int) (Math.random() * (y - x)) + x;
      stringBuilder.append(a).append(" ");
    }

    int[] mass = getInts(input, N, stringBuilder);


    int count = getCount(mass);

    TasksWriteReader.writer(output, count + " ");
  }

  public static int[] getInts(String input, int N, StringBuilder stringBuilder) throws IOException {
    TasksWriteReader.writer(input, stringBuilder.toString());

    String arr = TasksWriteReader.reader(input);
    String[] strings = parsStrings(arr);

    int[] mass = new int[N];

    for (int i = 0; i < strings.length; i++) {
      int m = Integer.parseInt(strings[i]);
      mass[i] = m;
    }
    System.out.println(Arrays.toString(mass));
    return mass;
  }

  public static int getCount(int[] mass) {
    int count = 0;
    int max = mass[0];


    for (int i = 0; i < mass.length; i++) {
      if (mass[i] > max) {
        max = mass[i];
      }


    }
    for (int i = 0; i< mass.length; i++){
      if (mass[i] == max){
        count++;
      }
    }
    return count;
  }

  public static String[] parsStrings(String s) {

    final var split = s.split("\n");
    return split[1].split("\\s");
  }
}

