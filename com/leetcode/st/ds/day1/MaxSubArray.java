package com.leetcode.st.ds.day1;

// https://leetcode.com/problems/maximum-subarray/?envType=study-plan&id=data-structure-i

public class MaxSubArray {

  public static void main(String[] args) {
    int[] num = { 5, 4, -1, 7, 8 };
    System.out.println(maxSubArray(num));
  }

  public static int maxSubArray(int[] nums) {
    // kadane's Algorithm
    int maxSoFar = Integer.MIN_VALUE;
    int maxEnding = 0;
    for (int i = 0; i < nums.length; i++) {
      maxEnding = maxEnding + nums[i];
      if (maxSoFar < maxEnding) {
        maxSoFar = maxEnding;
      }

      if (maxEnding < 0) {
        maxEnding = 0;
      }

    }
    return maxSoFar;
  }
}
