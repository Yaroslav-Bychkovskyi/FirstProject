package com.github.YBychkovskyi.FirstProject;

public class Tasks19_66 {
  public static boolean relativesByValue(int[] m) {

    int n = 0;
    int a = 0;
    int b = 0;

    for (int i = 0; i < m.length; i++) {
      for (int j = i + 1; j < m.length; j++) {
        if (m[i] == m[j]) {
          /*System.out.println("m[i] - " + m[i]);
          System.out.println("m[j] - " + m[j]);
          System.out.println(i);
          System.out.println(j);*/
          a = i;
          b = j;
          for (int x = a; x < b; x++) {
            n++;
            if(n == m[i]){
              return true;
            }
          }

        }
      }
    }



    return false;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int[] mass = new int[5];

    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(relativesByValue(mass));
  }
}
