package com.leetcode.st.algo.day1;

// https://leetcode.com/problems/search-insert-position/?envType=study-plan&id=algorithm-i

public class SearchInsertPosition {

  public static void main(String[] args) {
    int[] num = { 1, 3, 5, 6 };
    System.out.println(searchInsert(num, 5));
  }

  //1,3,5,6

  public static int searchInsert(int[] nums, int target) {
    if (nums.length == 0) {
      return 0;
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
    return left;
  }

}
