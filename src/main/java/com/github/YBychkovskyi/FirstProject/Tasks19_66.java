package com.github.YBychkovskyi.FirstProject;

public class Tasks19_66 {
  public static boolean relativesByValue(int[] m) {

 /*   int n = 0;

    for (int i = 0; i < m.length; i++) {
      for (int j = i + 1; j < m.length; j++) {
        if (m[i] == m[j]) {

          for (int x = i; x < j; x++) {
            n++;
            if(n == m[i]){
              return true;
            }
          }
        }
      }
    }*/
    int a;

    for (int i = 0; i < m.length; i++) {
      a = m[i];
      if (m[i] == m[a]) {
        return true;
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
