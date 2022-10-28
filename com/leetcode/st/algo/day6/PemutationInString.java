package com.leetcode.st.algo.day6;

import java.util.Arrays;

// https://leetcode.com/problems/permutation-in-string/description/?envType=study-plan&id=algorithm-i

public class PemutationInString {

  public static void main(String[] args) {

  }

  public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length() || s2.length() == 0) {
      return false;
    }
    if (s1.length() == 0) {
      return true;
    }

    int[] p1 = new int[26];
    int[] p2 = new int[26];
    int x = s1.length();
    int y = s2.length();

    for (int i = 0; i < s1.length(); i++) {
      p1[s1.charAt(i) - 'a']++;
      p2[s2.charAt(i) - 'a']++;
    }

    for (int i = x; i < y; i++) {
      if (Arrays.equals(p1, p2)) {
        return true;
      }
      p2[s2.charAt(i - x) - 'a']--;
      p2[s2.charAt(i) - 'a']++;
    }
    return Arrays.equals(p1, p2);
  }

}
