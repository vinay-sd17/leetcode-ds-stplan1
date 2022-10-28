package com.leetcode.st.ds.day2;

// https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class SetMisMatch {

  public static void main(String[] args) {
    int[] num = { 1, 1, 3 };
    System.out.println("res: " + Arrays.toString(findErrorNums(num)));
  }

  // 1,2,2,4
  public static int[] findErrorNums(int[] nums) {
    int[] res = new int[2];
    int[] tmp = new int[nums.length];
    for (int i : nums) {
      tmp[i - 1]++;
    }

    for (int i = 0; i < tmp.length; i++) {
      if (tmp[i] == 2) {
        res[0] = i + 1;
      }

      if (tmp[i] == 0) {
        res[1] = i + 1;
      }
    }
    return res;
  }

}
