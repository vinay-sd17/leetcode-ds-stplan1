package com.leetcode.st.algo.day2;

import java.util.Arrays;

// https://leetcode.com/problems/squares-of-a-sorted-array/description/

public class SquaresOfSortedArray {

  public static void main(String[] args) {
    int[] num1 = { -4, -1, 0, 3, 10 };
    int[] ints = sortedSquares(num1);
    System.out.println(Arrays.toString(ints));
  }

  public static int[] sortedSquares(int[] nums) {
    int p1 = 0;
    int p2 = nums.length - 1;
    int position = nums.length - 1;
    int[] op = new int[nums.length];

    while (p1 <= p2) {
      if (Math.abs(nums[p1]) > Math.abs(nums[p2])) {
        op[position--] = Math.abs(nums[p1] * nums[p1]);
        p1++;
      } else {
        op[position--] = Math.abs(nums[p2] * nums[p2]);
        p2--;
      }
    }
    return op;
  }

}
