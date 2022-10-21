package com.leetcode.st.algo.day1;

// https://leetcode.com/problems/binary-search/?envType=study-plan&id=algorithm-i

public class BinarySearch {

  public static void main(String[] args) {
    int[] num = { -1, 0, 3, 5, 9, 12 };
    System.out.println(search(num, 12));
  }

  public static int search(int[] nums, int target) {
    if (nums.length == 0) {
      return -1;
    }

    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }
}
