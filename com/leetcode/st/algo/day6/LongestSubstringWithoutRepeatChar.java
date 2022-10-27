package com.leetcode.st.algo.day6;

import java.util.HashSet;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/?envType=study-plan&id=algorithm-i

public class LongestSubstringWithoutRepeatChar {

  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abcabc"));
  }

  // abcab
  public static int lengthOfLongestSubstring(String s) {
    int p1 = 0;
    int p2 = 0;
    int max = 0;
    HashSet<Character> hashSet = new HashSet<>();
    while (p2 < s.length()) {
      if (!hashSet.contains(s.charAt(p2))) {
        hashSet.add(s.charAt(p2));
        p2++;
        max = Math.max(max, hashSet.size());
      } else {
        hashSet.remove(s.charAt(p1));
        p1++;
      }
    }
    return max;
  }

}
