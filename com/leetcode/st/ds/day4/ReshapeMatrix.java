package com.leetcode.st.ds.day4;

import java.util.Arrays;

// https://leetcode.com/problems/reshape-the-matrix/description/?envType=study-plan&id=data-structure-i

public class ReshapeMatrix {

  public static void main(String[] args) {
    int[][] num = new int[][] { { 1, 2 }, { 3, 4 } };
    System.out.println(Arrays.deepToString(matrixReshape(num, 1, 4)));
  }

  public static int[][] matrixReshape(int[][] mat, int r, int c) {
    int[][] result = new int[r][c];
    int row = mat.length;
    int col = mat[0].length;
    if ((row * col) != (r * c)) {
      return mat;
    }

    int rowIndex = 0;
    int colIndex = 0;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        result[rowIndex][colIndex] = mat[i][j];
        colIndex++;
        if (colIndex == c) {
          colIndex = 0;
          rowIndex++;
        }
      }
    }

    return result;
  }
}
