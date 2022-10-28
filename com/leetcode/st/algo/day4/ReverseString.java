package com.leetcode.st.algo.day4;

// https://leetcode.com/problems/reverse-string/?envType=study-plan&id=algorithm-i

public class ReverseString {

  public static void main(String[] args) {
    reverseString(new char[] { 'h', 'e', 'l', 'l', 'o' });
  }

  public static void reverseString(char[] s) {
    int p1 = 0;
    int p2 = s.length - 1;
    while (p1 < p2) {
      char tmp = s[p1];
      s[p1] = s[p2];
      s[p2] = tmp;
      p1++;
      p2--;
    }
    System.out.println(s);
  }

}
