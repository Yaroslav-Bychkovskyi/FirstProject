package com.github.YBychkovskyi.FirstProject;

import java.io.IOException;

public class TasksReverse14 {
  public static void main(String[] args) throws IOException {

    String input = "input.txt";
    String output = "output.txt";

    String s = TasksWriteReader.reader(input);
    final var split = s.split("\n");

    int n = Integer.parseInt(split[0]);

    StringBuilder stringBuilder = new StringBuilder();

   // TasksWriteReader.writer(input, stringBuilder.toString());

  }
}
