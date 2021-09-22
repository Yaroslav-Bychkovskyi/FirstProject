package com.github.YBychkovskyi.FirstProject;

import java.io.IOException;

public class TasksEvenOdd216 {
  public static void main(String[] args) throws IOException {
    String input = "input.txt";
    String output = "output.txt";

    String s = TasksWriteReader.reader(input);

    int[] arr = TasksReverse14.parseString(s);
    extracted(output, arr);
  }

  private static void extracted(String output, int[] arr) throws IOException {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        stringBuilder.append(arr[i]).append(" ");
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 != 0) {
        stringBuilder.append(arr[i]).append(" ");
      }
    }

    TasksWriteReader.writer(output, stringBuilder.toString());
  }
}
