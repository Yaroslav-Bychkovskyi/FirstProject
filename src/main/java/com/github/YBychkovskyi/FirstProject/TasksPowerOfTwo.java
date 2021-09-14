package com.github.YBychkovskyi.FirstProject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TasksPowerOfTwo {
  public static void main(String[] args) throws IOException {

    FileWriter fileWriter = new FileWriter("input.txt");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введеть число a - ");

    int scrA = scanner.nextInt();

    if (0 <= scrA && scrA<= 1024){
      scrA = scanner.nextInt();
    }
  }
}
