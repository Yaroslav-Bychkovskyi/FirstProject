package com.github.YBychkovskyi.FirstProject;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TasksSum {
  public static void main(String[] args) throws IOException {


    int a;
    File file = new File("input.txt");
    file.createNewFile();

    File file1 = new File("output.txt");
    file1.createNewFile();

    FileReader fr = new FileReader("input.txt");
    Scanner scanner = new Scanner(fr);
    int s = scanner.nextInt();
    int b = scanner.nextInt();

    a = s + b;
    FileWriter fileWriter = new FileWriter("output.txt");
    fileWriter.write(a + " ");
    fileWriter.close();


    System.out.println(s + " " + b);
    System.out.println(a);
  }
}
