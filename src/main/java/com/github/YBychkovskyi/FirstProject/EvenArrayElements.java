package com.github.YBychkovskyi.FirstProject;

public class EvenArrayElements {
  public static void main(String[] args) {
    int mass[] = {2, 5, 12, 2, 68, 2, 33, 45, 21};
    int mass2[] = new int[mass.length];
    int x = 0;


    for (int i = 0; i < mass.length; i++) {
      if (mass[i] % 2 == 0) {
        mass2[x] = i;
        x += 1;

      }

    }
    System.out.println("Індекс елементів: ");

    for (int i = 0; i < x; i++)
      System.out.println(mass2[i]);
  }
}
