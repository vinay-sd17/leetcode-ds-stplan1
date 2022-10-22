package com.leetcode.st.ds.day2;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/828084000/

public class RemoveDuplicatesFromSortedArray {

  public static void main(String[] args) {
    int[] num = { 1 };
    System.out.println(removeDuplicates(num));
  }

  // Input: nums = [1,1,2]
  // Output: 2, nums = [1,2,_]
  public static int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return -1;
    }

    int lastCompare = nums[0];
    int replacableIndex = 1;
    int k = 1;

    for (int i = 1; i < nums.length; i++) {
      if (lastCompare != nums[i]) {
        lastCompare = nums[i];
        nums[replacableIndex++] = lastCompare;
        k++;
      }
    }
    return k;
  }

}
