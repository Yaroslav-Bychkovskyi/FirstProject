package com.github.YBychkovskyi.FirstProject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TasksNK7 {
  public static void main(String[] args) throws IOException {
    FileReader fr = new FileReader("input.txt");
    Scanner scanner = new Scanner(fr);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int m;
    m = n / k;
    FileWriter fileWriter = new FileWriter("output.txt");
    fileWriter.write(m + " ");
    fileWriter.close();
  }
}
