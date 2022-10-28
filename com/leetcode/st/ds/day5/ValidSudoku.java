package com.leetcode.st.ds.day5;

// https://leetcode.com/problems/valid-sudoku/?envType=study-plan&id=data-structure-i

import java.util.HashSet;

public class ValidSudoku {

  public static void main(String[] args) {
    char [][] b = new char[][] {
        { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
        { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
        { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
        { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
        { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
        { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
        { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
        { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
    };
    System.out.println(isValidSudoku(b));

    char[][] a = new char[][] {
        { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
        { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
        { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
        { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
        { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
        { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
        { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
        { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
    };
    System.out.println(isValidSudoku(a));
  }

  public static boolean isValidSudoku(char[][] board) {
    HashSet<String> seen = new HashSet<>();
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        char curVal = board[i][j];
        if (curVal != '.') {
          if (!seen.add(curVal + " row " + i) || !seen.add(curVal + " col " + j) || !seen.add(
              curVal + " box " + i / 3 + " - " + j / 3)) {
            return false;
          }
        }
      }
    }
    return true;
  }

}
