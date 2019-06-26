package com.so;

/**
 * 第16题 反转链表
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
     * 解法一：迭代：两个指针，反向输出
     * 时间复杂度：O(n)，空间复杂度：O(1)
     *
     * @param head
     * @return
     */
    public static ListNode reverseList1(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode tmp = curr.nextNode;
            curr.nextNode = pre;
            pre = curr;
            curr = tmp;
        }
        return pre;
    }

    /**
     * 解法二：迭代：单指针依次往后移动，改变原节点间的指向
     * 时间复杂度：O(n)，空间复杂度：O(1)
     *
     * @param head
     * @return
     */
    public static ListNode reverseList2(ListNode head) {
        ListNode pre = null;

        while (head != null) {
            ListNode p = head.nextNode;
            head.nextNode = pre;
            pre = head;
            head = p;
        }
        return pre;
    }

    /**
     * 解法三：递归
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param head
     * @return
     */
    public static ListNode reverseList3(ListNode head) {
        if (head == null || head.nextNode == null) {
            return head;
        }

        ListNode p = reverseList3(head.nextNode);
        head.nextNode.nextNode = head.nextNode;
        head.nextNode = null;
        return p;
    }
}
