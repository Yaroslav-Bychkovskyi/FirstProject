package com.github.YBychkovskyi.FirstProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TasksCells {
  public static void main(String[] args) throws FileNotFoundException {


    FileReader fr = new FileReader("input.txt");
    Scanner scanner = new Scanner(fr);
    int x1 = scanner.nextInt();
    int x2 = scanner.nextInt();
    int y1 = scanner.nextInt();
    int y2 = scanner.nextInt();


  }
}
