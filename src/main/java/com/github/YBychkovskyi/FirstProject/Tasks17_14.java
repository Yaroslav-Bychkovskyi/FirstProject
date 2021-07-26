package com.github.YBychkovskyi.FirstProject;


import java.util.Scanner;

public class Tasks17_14 {

  public static void average(int a, int b) {


    int x = 0,y = 0;

   // Tasks17_10 tasksA = new Tasks17_10();
    Tasks17_10.sumDigits(a);
     x = a;


    //Tasks17_10 tasksB = new Tasks17_10();
    Tasks17_10.sumDigits(b);
     y = b;

    System.out.println((x + y) / 2);


  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введеть число a - ");
    int scrA = scanner.nextInt();


    System.out.println("Введеть число b - ");
    int scrB = scanner.nextInt();


    //  System.out.println(scrA);
    //System.out.println(scrB);

    average(scrA,scrB);

  }
}
