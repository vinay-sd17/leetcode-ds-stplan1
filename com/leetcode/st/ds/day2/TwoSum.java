package com.leetcode.st.ds.day2;

import java.util.Arrays;
import java.util.HashMap;

// https://leetcode.com/problems/two-sum/?envType=study-plan&id=data-structure-i
public class TwoSum {

  public static void main(String[] args) throws IllegalAccessException {
    int[] num = { 2, 7, 11, 15 };
    System.out.println(Arrays.toString(twoSum(num, 9)));
  }

  //Input: nums = [2,7,11,15], target = 9
  //Output: [0,1]
  // not good for time complexity
  public static int[] twoSum1(int[] nums, int target) throws IllegalAccessException {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        int res = target - nums[i];
        if (nums[j] == res) {
          return new int[] { i, j };
        }
      }
    }
    throw new IllegalAccessException("No match found");
  }

  public static int[] twoSum(int[] nums, int target) throws IllegalAccessException {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int res = target - nums[i];
      if (map.containsKey(res)) {
        return new int[] { map.get(res), i };
      }
      map.put(nums[i], i);
    }

    throw new IllegalAccessException("No match found");
  }

}
