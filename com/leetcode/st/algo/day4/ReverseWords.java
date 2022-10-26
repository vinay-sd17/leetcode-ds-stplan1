package com.leetcode.st.algo.day4;

// https://leetcode.com/problems/reverse-words-in-a-string-iii/description/?envType=study-plan&id=algorithm-i
public class ReverseWords {

  public static void main(String[] args) {
    String ss = "God Ding";
    System.out.println(reverseWords(ss));
  }

  public static String reverseWords(String s) {
    StringBuilder res = new StringBuilder();
    String[] words = s.split(" ");
    for (int i = 0; i < words.length; i++) {
      char[] ca = words[i].toCharArray();
      res.append(reverse(ca)).append(" ");
    }
    res.setLength(res.length() - 1);
    return res.toString();
  }

  public static String reverse(char[] inp) {
    int p1 = 0;
    int p2 = inp.length - 1;
    while (p1 < p2) {
      char tmp = inp[p1];
      inp[p1] = inp[p2];
      inp[p2] = tmp;
      p1++;
      p2--;
    }
    return new String(inp);
  }

}
