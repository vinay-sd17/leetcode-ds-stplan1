package com.leetcode.st.algo.day1;

// https://leetcode.com/problems/first-bad-version/submissions/827525606/?envType=study-plan&id=algorithm-i

public class FirstBadVersion {

  public static void main(String[] args) {

  }

  public int firstBadVersion(int n) {
    int left = 0;
    int right = n;

    while (left < right) {
      int mid = left + (right - left) / 2;
      if (isBadVersion(mid)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    if (left == right && isBadVersion(left)) {
      return left;
    }

    return -1;
  }

  // contract method impl in leetcode extended class
  public static boolean isBadVersion(int num) {
    return false;
  }

}
