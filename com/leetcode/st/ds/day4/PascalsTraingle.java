package com.leetcode.st.ds.day4;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/description/

public class PascalsTraingle {

  public static void main(String[] args) {
    System.out.println(generate(5));
  }

  public static List<List<Integer>> generate(int numRows) {
    List<List<Integer>> triangle = new ArrayList<>();
    List<Integer> firstRow = new ArrayList<>();
    if (numRows == 0) {
      return triangle;
    }
    firstRow.add(1);
    triangle.add(firstRow);
    for (int i = 1; i < numRows; i++) {
      List<Integer> prevRow = triangle.get(i - 1);
      List<Integer> currentRow = new ArrayList<>();
      currentRow.add(1);
      for (int j = 1; j < i; j++) {
        currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
      }
      currentRow.add(1);
      triangle.add(currentRow);
    }
    return triangle;
  }

}
