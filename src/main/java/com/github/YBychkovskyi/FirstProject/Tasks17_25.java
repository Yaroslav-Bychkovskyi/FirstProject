package com.github.YBychkovskyi.FirstProject;

import java.util.Scanner;

public class Tasks17_25 {
  public static int numberPrimes(int N) {

    int x = 0;

    for (int i = 0; i < N; i++) {


      if (Tasks17_15.primeNumber(i)){
        x++;
      }

    }

    return x;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введеть число N - ");
    int scrN = scanner.nextInt();

    System.out.println(numberPrimes(scrN));
  }
}
