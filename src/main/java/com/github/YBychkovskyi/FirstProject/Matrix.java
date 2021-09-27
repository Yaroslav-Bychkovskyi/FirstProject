package com.github.YBychkovskyi.FirstProject;

import java.util.Arrays;

public class Matrix {
  int x;
  int y;
  int[][] material;

  public Matrix(int x, int y, int[][] material) {
    this.x = x;
    this.y = y;
    this.material = material;
  }

  public Matrix addition(Matrix other) {
    int[][] matrixAdd = new int[this.material.length][this.material.length];
    for (int i = 0; i < this.material.length; i++)
      for (int j = 0; j < this.material[i].length; j++) {
        matrixAdd[i][j] = this.material[i][j] + other.material[i][j];
      }

    return new Matrix(x, y, matrixAdd);

  }

  public Matrix multiplication(int a) {

    int[][] matrix1 = new int[x][y];
    for (int i = 0; i < this.material.length; i++)
      for (int j = 0; j < this.material[i].length; j++) {
        matrix1[i][j] = material[i][j] * a;
      }
    return new Matrix(x, y, matrix1);
  }

  public int[][] matrixMultiplicationOptional(int[][] m) {
    return null;
  }


  public static void main(String[] args) {
    int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    Matrix matrix = new Matrix(3, 3, mat);
    Matrix multiplied = matrix.multiplication(7);
    System.out.println(matrix);
    System.out.println(multiplied);
    Matrix matrix1 = matrix.addition(multiplied);
    System.out.println(matrix1);

  }

  @Override
  public String toString() {
    return "Matrix{" +
      "material=" + Arrays.deepToString(material) +
      '}';
  }
}
