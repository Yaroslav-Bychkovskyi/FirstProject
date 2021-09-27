package com.github.YBychkovskyi.FirstProject;

import java.io.IOException;

public class TasksReverse14 {
  public static void main(String[] args) throws IOException {

    String input = "input.txt";
    String output = "output.txt";

    String s = TasksWriteReader.reader(input);

    int[] arr = parseString(s);

    final var reversedArr = solveTask(arr);

    var result = toFileContent(reversedArr);

    TasksWriteReader.writer(output, result);
  }

  private static int[] solveTask(int[] arr) {
    var result = new int[arr.length];

    for (int i = arr.length - 1; i >= 0; i--) {
      result[arr.length - 1 - i] = arr[i];
    }

    return result;
  }

  private static String toFileContent(int[] arr) {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < arr.length; i++) {
      stringBuilder.append(arr[i]).append(" ");
    }

    return stringBuilder.toString();
  }

  public static int[] parseString(String s) {
    final var split = s.split("\n");

    String[] mass = split[1].split("\\s");
    int[] arr = new int[mass.length];

    for (int i = 0; i < mass.length; i++) {
      int m = Integer.parseInt(mass[i]);
      arr[i] = m;
    }
    return arr;
  }
}
