package com.github.YBychkovskyi.FirstProject;

import java.io.IOException;

public class TasksIdenticalPairs218 {
  public static void main(String[] args) throws IOException {
    String input = "input.txt";
    String output = "output.txt";

    String s = TasksWriteReader.reader(input);

    int[] arr = TasksReverse14.parseString(s);
    extracted(output, arr);
  }

  private static void extracted(String output, int[] arr) throws IOException {

    int count = 0;

    for (int i = 0; i < arr.length-1; i++) {

        if (arr[i] == arr[i+1]) {
          count++;

      }
    }

    TasksWriteReader.writer(output, count + " ");
  }
}
