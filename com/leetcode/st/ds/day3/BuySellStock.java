package com.leetcode.st.ds.day3;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan&id=data-structure-i
public class BuySellStock {

  public static void main(String[] args) {
    int[] num1 = { 7, 1, 5, 3, 6, 4 };
    System.out.println("res: " + maxProfit(num1));
  }

  // Input: prices = [7,1,5,3,6,4]
  // Output: 5
  // Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
  // Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell
  public static int maxProfit(int[] prices) {
    int maxProfit = 0;
    int buyPrice = Integer.MAX_VALUE;
    for (int price : prices) {
      if (price < buyPrice) {
        buyPrice = price;
      } else if (price - buyPrice > maxProfit) {
        maxProfit = price - buyPrice;
      }
    }
    return maxProfit;

  }

}
