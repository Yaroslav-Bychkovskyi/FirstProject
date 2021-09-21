package com.github.YBychkovskyi.FirstProject;

import java.io.IOException;
import java.util.ArrayList;

public class TasksShortGCD12 {
  public static void main(String[] args) throws IOException {

    String input = "input.txt";
    String output = "output.txt";

    String s = TasksWriteReader.reader(input);
    final var split = s.split("\\s");


    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < split.length; i++){
      int x = Integer.parseInt(split[i]);
      list.add(x);
    }

    int n = list.get(0);
    int m = list.get(1);

    if (n < 0 || n > 30000) {
      System.out.println("Помилка");
      throw new RuntimeException("Runtime");
    }

    if (m < 0 || m > 30000) {
      System.out.println("Помилка");
      throw new RuntimeException("Runtime");
    }

    ArrayList<Integer> integerArrayList = new ArrayList<>();
    integerArrayList.addAll(extracted(n));
    integerArrayList.addAll(extracted(m));

    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < integerArrayList.size(); i++) {
      for (int j = i + 1; j < integerArrayList.size(); j++) {
        if (integerArrayList.get(i).equals(integerArrayList.get(j))) {
          arrayList.add(integerArrayList.get(i));

        }
      }
    }

    int max = arrayList.get(0);
    for (Integer integer : arrayList) {
      if (integer > max) {
        max = integer;
      }
    }
    TasksWriteReader.writer(output, max + " ");

  }


  private static ArrayList<Integer> extracted(int m) {
    ArrayList<Integer> mas = new ArrayList<>();
    for (int i = 1; i <= m; i++) {
      if (m % i == 0) {
        mas.add(i);
      }
    }
    return mas;
  }
}
