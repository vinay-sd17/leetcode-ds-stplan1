package com.leetcode.st.ds.day3;

import java.util.Arrays;

// https://leetcode.com/problems/intersection-of-two-arrays-ii/?envType=study-plan&id=data-structure-i

public class IntersectionOfTwoArrays {

  public static void main(String[] args) {
    int[] num1 = { 1, 2 };
    int[] num2 = { 1, 1 };
    System.out.println("res: " + Arrays.toString(intersect(num1, num2)));
  }

  //Input: nums1 = [1,2,2,1], nums2 = [2,2]
  //Output: [2,2]
  public static int[] intersect(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int[] aux = new int[nums1.length];
    int p1 = 0;
    int p2 = 0;
    int index = 0;
    while (p1 < nums1.length && p2 < nums2.length) {
      if (nums1[p1] == nums2[p2]) {
        aux[index++] = nums1[p1++];
        p2++;
      } else if (nums1[p1] < nums2[p2]) {
        p1++;
      } else {
        p2++;
      }
    }
    int[] res = new int[index];
    System.arraycopy(aux, 0, res, 0, index);
    return res;
  }

}
