package com.github.YBychkovskyi.FirstProject;

public class Tasks17_2 {


  static double testl(double х, int у, boolean z) {
    return 0;
  }

  static void test2(double х, int у, boolean z) {

  }

  public static void main(String[] args) {

    int a = 0, b = 0, f=0;
    double c, d;
    boolean e = false;
    // a=testl(5.3, a, e);
    d = testl(1, 2, true);

/*    if (testl(d, b, e) == f) {
      test2(d, c + b, e);
    }*/

    System.out.println(what(7,3));
    System.out.println(what(14,35));
  }

  public static int what(int a, int b){
    while (a!=b){
      if(a>b) a = a-b;
      else b= b - a;
    }
    return a;
  }
}
