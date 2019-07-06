package com.so;

import com.so.Common.ListNode;

/**
 * 第15题
 * 输入一个链表，输出该链表的倒数第K个结点
 *
 * @author qgl
 * @date 2017/08/10
 */
public class FindKthToTail15 {

    /**
     * 解法一：一快一慢两个指针，快指针先走k步，然后两个指针同时走
     *
     * @param head
     * @param k
     * @return
     */
    public static ListNode findKthToTail(ListNode head, int k) {
        if (head == null || k < 1) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (k-- > 1) {
            if (fast.next == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
     * 解法二：不推荐，O(n^2)，先获取链表长度，在用链表长度减去k的值，求得该值处的节点
     *
     * @param head
     * @param k
     * @return
     */
    public static ListNode findKthToTail2(ListNode head, int k) {
        int length = 0;
        ListNode p = head;
        while (p != null) {
            length++;
            p = p.next;
        }
        ListNode target = null;
        if (length == k) {
            target = head;
        }

        for (int i = 0; i < length - k; i++) {
            head = head.next;
            target = head;
        }
        return target;
    }
}
