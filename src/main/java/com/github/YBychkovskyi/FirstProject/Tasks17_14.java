package com.github.YBychkovskyi.FirstProject;


import java.util.Scanner;

public class Tasks17_14 {

  public static int average(int a, int b) {


    int x = 0,y = 0;


     x = Tasks17_10.sumDigits(a);;

     y = Tasks17_10.sumDigits(b);;

    return (x + y) / 2;


  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введеть число a - ");
    int scrA = scanner.nextInt();


    System.out.println("Введеть число b - ");
    int scrB = scanner.nextInt();

    System.out.println(average(scrA,scrB));

  }
}
