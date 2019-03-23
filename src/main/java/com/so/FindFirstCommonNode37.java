package com.so;

/**
 * 第37题
 * 求两个单向链表的第一个公共节点
 *
 * @author qgl
 * @date 2017/08/15
 */
public class FindFirstCommonNode37 {

    /**
     * 链表
     */
    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 解法一：长链表先走，需要遍历链表
     * @param pHead1
     * @param pHead2
     * @return
     */
    public static ListNode findFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        int length1 = getListNodeLength(p1);
        int length2 = getListNodeLength(p2);
        int diff = 0;
        if (length1 - length2 > 0) {
            diff = length1 - length2;
            while (diff-- > 0) {
                pHead1 = pHead1.next;
            }
        } else {
            diff = length2 - length1;
            while (diff-- > 0) {
                pHead2 = pHead2.next;
            }
        }

        while (pHead1 != null && pHead2 != null) {
            if (pHead1 == pHead2) {
                return pHead1;
            }
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return null;
    }

    /**
     * 获取链表长度
     * @param root
     * @return
     */
    private static int getListNodeLength(ListNode root) {
        int result = 0;
        if (root == null)
            return result;
        ListNode point = root;

        while (point != null) {
            point = point.next;
            result++;
        }
        return result;
    }

    /**
     * 解法二：不需要遍历链表
     * @param pHead1
     * @param pHead2
     * @return
     */
    public static ListNode findFirstCommonNode2(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }

        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1 != p2) {
            p1 = (p1 != null ? p1.next : pHead2);
            p2 = (p2 != null ? p2.next : pHead1);
        }
        return p1;
    }
}
