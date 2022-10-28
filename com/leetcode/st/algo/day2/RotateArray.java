package com.leetcode.st.algo.day2;

import java.util.Arrays;

// https://leetcode.com/problems/rotate-array/description/?envType=study-plan&id=algorithm-i

public class RotateArray {

  public static void main(String[] args) {
    // reverse whole list
    // reverse 0, k,
    //reverse k, end

    int[] num1 = { 1, 2, 3, 4, 5, 6, 7 };
    rotate(num1, 8);
    System.out.println(Arrays.toString(num1));
  }

  public static void rotate(int[] nums, int k) {
    k = k % nums.length; // if size is grater, setting it to length
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);

  }

  public static void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }

}
