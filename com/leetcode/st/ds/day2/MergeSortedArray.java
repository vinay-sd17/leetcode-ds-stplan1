package com.leetcode.st.ds.day2;

// https://leetcode.com/problems/merge-sorted-array/?envType=study-plan&id=data-structure-i
// Ascending order: 1,2,3,4,5 Non-decreasing order: 1,2,2,2,3,4,5
// If you have any number occuring more than once, you can not put them in an ascending order, hence Non-decreasing term is prefered.

public class MergeSortedArray {

  public static void main(String[] args) {
    int[] num1 = { 0, 0 };
    int[] num2 = { 9, 11 };
    merge(num1, 0, num2, 2);
    System.out.println();
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1 = m - 1;
    int p2 = n - 1;
    int index = m + n - 1;
    while (p2 >= 0) {
      if (p1 >= 0 && nums1[p1] > nums2[p2]) {
        nums1[index--] = nums1[p1--];
      } else {
        nums1[index--] = nums2[p2--];
      }
    }

    for (int i : nums1) {
      System.out.println(i);
    }
  }

}
