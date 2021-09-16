package com.github.YBychkovskyi.FirstProject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TasksThreeDigitNumbers8 {
  public static void main(String[] args) throws IOException {

    FileWriter fileWriter = new FileWriter("input.txt");

    for (int i = 100; i < 1000; i++) {
      fileWriter.write(i + " ");
    }
    fileWriter.close();

    FileReader fr = new FileReader("input.txt");
    Scanner scr = new Scanner(fr);

    int[] arr = new int[900];

    for (int i = 0; i< arr.length;i++) {
      int n = scr.nextInt();
      arr[i] = n;
    }
    System.out.println(Arrays.toString(arr));

    int m = 1;

    for (int i = 1; i < 3; i++) {
      m = m * 10;
    }


    final var rozrad = m;
    int x, y = n;
    int r = rozrad;

    int[] mass = new int[String.valueOf(n).length()];

    for (int i = 0; i < String.valueOf(n).length(); i++) {
      x = y / r;
      y = n % r;
      mass[i] = x;
      r = r / 10;
    }
  }

}
