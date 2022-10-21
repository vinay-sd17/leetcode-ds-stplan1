package com.leetcode.st.ds.day1;

// https://leetcode.com/problems/contains-duplicate/?envType=study-plan&id=data-structure-i

import java.util.HashMap;

public class ContainsDuplicate {

  public static void main(String[] args) {
    int[] num = { 1,1,1,3,3,4,3,2,4,2 };
    System.out.println(containsDuplicate(num));
  }

  public static boolean containsDuplicate(int[] nums) {

    boolean hasDuplicates = false;
    HashMap<Integer, Integer> dict = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (dict.containsKey(nums[i])) {
        hasDuplicates = true;
        break;
      } else {
        dict.put(nums[i], 0);
      }
    }
    return hasDuplicates;
  }
}
