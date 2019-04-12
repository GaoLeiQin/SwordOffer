package com.so;

/**
 * 第56题
 * 找出环链表的入口结点
 *
 * @author qgl
 * @date 2017/08/30
 */
public class EnterLoop56 {
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
     * 获取环形链表的入口节点
     *
     * @param pHead
     * @return
     */
    public static ListNode enterNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return null;
        }
        ListNode slow = pHead;
        ListNode fast = pHead;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                fast = pHead;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
