package com.github.YBychkovskyi.FirstProject;

import java.io.FileWriter;
import java.io.IOException;

public class TasksSubsequence6 {
  public static void main(String[] args) throws IOException {

    int x = -1000;
    int y = 1000;
    int count = 0;
    int last;
    int a = 0;

    FileWriter fileWriter = new FileWriter("input.txt");
    FileWriter fileWriter1 = new FileWriter("output.txt");

      do {
      last = a;
      a = (int) (Math.random() * (y - x)) + x;

      count++;
      fileWriter.write(a + " ");

    } while (a != last);
    fileWriter1.write(count + "");
    fileWriter.close();
    fileWriter1.close();


  }
}
