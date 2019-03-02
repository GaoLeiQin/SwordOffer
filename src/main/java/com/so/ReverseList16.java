package com.so;

/**
 * 第16题
 * 输入一个链表的头结点，反转该链表并输出翻转后的头结点
 *
 * @author qgl
 * @date 2017/08/10
 */
public class ReverseList16 {
    /**
     * 链表
     */
    public static class ListNode {
        int data;
        ListNode nextNode;
    }

    /**
     * 解法一：反转链表，两个指针，反向输出
     * @param head
     * @return
     */
    public static ListNode reverseList1(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode preListNode = null;
        ListNode nowListNode = head;

        while(nowListNode.nextNode!=null) {
            ListNode nextListNode = nowListNode.nextNode;
            nowListNode.nextNode = preListNode;
            preListNode = nowListNode;
            nowListNode = nextListNode;
        }
        return nowListNode;
    }

    /**
     * 解法二：反转链表。单指针依次往后移动，改变原节点间的指向
     * @param head
     * @return
     */
    public static ListNode reverseList2(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode pre = null;
        while(head != null) {
            ListNode p = head.nextNode;
            head.nextNode = pre;
            pre = head;
            head = p;
        }
        return pre;
    }

}
