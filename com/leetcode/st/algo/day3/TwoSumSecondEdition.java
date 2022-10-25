package com.leetcode.st.algo.day3;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumSecondEdition {

  public static void main(String[] args) {
    int[] num = { -1,0 };
    System.out.println(Arrays.toString(twoSum(num, -1)));
  }

  public static int[] twoSum(int[] numbers, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < numbers.length; i++) {
      int k = target - numbers[i];
      if (map.containsKey(k)) {
        return new int[] { map.get(k) + 1, i + 1 };
      } else {
        map.put(numbers[i], i);
      }
    }
    return null;
  }

}
