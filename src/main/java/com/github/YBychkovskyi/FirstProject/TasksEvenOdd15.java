package com.github.YBychkovskyi.FirstProject;

import java.io.IOException;

public class TasksEvenOdd15 {
  public static void main(String[] args) throws IOException {

    String input = "input.txt";
    String output = "output.txt";

    String s = TasksWriteReader.reader(input);

    int[] arr = TasksReverse14.parseString(s);
    extracted(output, arr);
  }

  private static void extracted(String output, int[] arr) throws IOException {
    StringBuilder stringBuilder = new StringBuilder();

    for (int k : arr) {
      if (k % 2 != 0) {
        stringBuilder.append(k).append(" ");
      }

    }
    for (int j : arr) {
      if (j % 2 == 0) {
        stringBuilder.append(j).append(" ");
      }

    }
    TasksWriteReader.writer(output, stringBuilder.toString());
  }
}
