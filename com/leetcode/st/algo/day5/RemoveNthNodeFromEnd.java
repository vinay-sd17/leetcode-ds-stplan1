package com.leetcode.st.algo.day5;

import com.leetcode.st.algo.common.ListNode;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/?envType=study-plan&id=algorithm-i
public class RemoveNthNodeFromEnd {

  public static void main(String[] args) {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;
    node5.next = null;

    ListNode listNode = removeNthFromEnd(node1, 2);
  }

  public static ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0, head);
    ListNode slow = dummy;
    ListNode fast = dummy;
    for (int i = 1; i <= n + 1; i++) {
      fast = fast.next;
    }

    while (fast != null) {
      slow = slow.next;
      fast = fast.next;
    }

    slow.next = slow.next.next;
    return dummy.next;
  }

}
