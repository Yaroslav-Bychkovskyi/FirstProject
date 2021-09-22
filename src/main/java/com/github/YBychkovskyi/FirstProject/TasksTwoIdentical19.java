package com.github.YBychkovskyi.FirstProject;

import java.io.IOException;

public class TasksTwoIdentical19 {
  public static void main(String[] args) throws IOException {
    String input = "input.txt";
    String output = "output.txt";

    String s = TasksWriteReader.reader(input);

    int[] arr = TasksReverse14.parseString(s);
    extracted(output, arr);
  }

  private static void extracted(String output, int[] arr) throws IOException {

    StringBuilder stringBuilder = new StringBuilder();

    int a = 0;
    int b = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          a = i;
          b = j;

        }
      }
    }

    stringBuilder.append(a).append(" ").append(b);

    TasksWriteReader.writer(output, stringBuilder.toString());
  }
}
