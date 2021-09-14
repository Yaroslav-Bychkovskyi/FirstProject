package com.github.YBychkovskyi.FirstProject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TasksMinimum {
  public static void main(String[] args) throws IOException {

    FileWriter fileWriter = new FileWriter("input.txt");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введеть число a - ");

    int scrA = scanner.nextInt();
    fileWriter.write(scrA + "\n");

    int x = -99;
    int y = 99;
    int[] mass = new int[scrA];

    Tasks19_22.creatingArray(mass, x, y);

    for (int i = 0; i < mass.length; i++) {
      fileWriter.write(mass[i] + " ");
    }

    fileWriter.close();


    FileReader fr = new FileReader("input.txt");
    Scanner scr = new Scanner(fr);
    int n = scr.nextInt();

    int[] arr = new int[n];
    int min = arr[0];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = scr.nextInt();
      if (arr[i] < min) {
        min = arr[i];
      }
    }

    FileWriter fileWriter1 = new FileWriter("output.txt");
    fileWriter1.write(min + " ");
    fileWriter1.close();
  }
}
