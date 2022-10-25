package com.leetcode.st.algo.day3;

import java.util.Arrays;

// https://leetcode.com/problems/move-zeroes/?envType=study-plan&id=algorithm-i

public class MoveZeros {

  public static void main(String[] args) {
    int[] num1 = { 0, 1, 0, 3, 12 };
    moveZeroes(num1);
  }

  //Input: nums = [0,1,0,3,12]
  //Output: [1,3,12,0,0]
  public static void moveZeroes(int[] nums) {
    int p1 = 0;
    int p2 = 0;
    while (p1 < nums.length) {
      if (nums[p1] == 0) {
        p1++;
      } else {
        int tmp = nums[p2];
        nums[p2] = nums[p1];
        nums[p1] = tmp;
        p1++;
        p2++;
      }
    }
    System.out.println(Arrays.toString(nums));
  }

}
