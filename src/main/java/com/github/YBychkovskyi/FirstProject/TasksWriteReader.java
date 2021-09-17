package com.github.YBychkovskyi.FirstProject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TasksWriteReader {

  public static void writer(String fileName, String s) throws IOException {

    FileWriter fileWriter = new FileWriter(fileName);

    fileWriter.write(s);
    fileWriter.close();

  }

  public static String reader(String fileName) throws IOException {
    FileReader fr = new FileReader(fileName);
    Scanner scr = new Scanner(fr);
    StringBuilder stringBuilder = new StringBuilder();

    int i = 1;
    String string;
    while (scr.hasNextLine()) {
      string = scr.nextLine();
      stringBuilder.append(string);
      stringBuilder.append("\n");
      i++;
    }

    fr.close();

    return stringBuilder.toString();

  }
}
