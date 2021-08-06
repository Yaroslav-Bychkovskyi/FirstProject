import com.github.YBychkovskyi.FirstProject.Tasks19_22;

public class Tasks19_26 {

  public static boolean numbersProduct(int[] m, int X) {

    int b;
    for (int j = 0; j < m.length; j++) {
      b = m[j];
    for (int i = 0; i < m.length; i++) {

      if (b * m[i] == X) {
        System.out.println(b + " " + m[i]);
        System.out.println(b * m[i]);
        return true;
      }

      }

    }
    return false;

  }

  public static void main(String[] args) {
    int x = 10;
    int y = 99;
    int mass[] = new int[5];
    Tasks19_22.creatingArray(mass, x, y);
    System.out.println(numbersProduct(mass, 3650));
  }
}
