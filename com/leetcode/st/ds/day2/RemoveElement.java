package com.leetcode.st.ds.day2;

// https://leetcode.com/problems/remove-element/

public class RemoveElement {

  public static void main(String[] args) {
    int[] num = { 3, 2, 2, 3 };
    System.out.println("res: " + removeElement(num, 3));
  }

  // Input: nums = [3,2,2,3], val = 3
  //Output: 2, nums = [2,2,_,_]
  //Explanation: Your function should return k = 2, with the first two elements of nums being 2.
  //It does not matter what you leave beyond the returned k (hence they are underscores).
  public static int removeElement(int[] nums, int val) {
    int index = 0;
    int count = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[index++] = nums[i];
        count++;
      }
    }
    for (int i : nums) {
      System.out.println(i);
    }
    return count;
  }

}
