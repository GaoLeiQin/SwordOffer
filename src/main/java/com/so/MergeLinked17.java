package com.so;

import com.so.Common.ListNode;

/**
 * 第17题
 * 输入两个递增的链表，合并这两个链表并使新链表仍然是递增的
 *
 * @author qgl
 * @date 2017/08/10
 */
public class MergeLinked17 {
    /**
     * 解法一：递归
     * 时间复杂度：O(m+n)，空间复杂度：O(m+n)
     *
     * @param list1
     * @param list2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    /**
     * 解法二：迭代
     * 时间复杂度：O(m+n)，空间复杂度：O(1)
     *
     * @param list1
     * @param list2
     * @return
     */
    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        ListNode preHead = new ListNode(-1);
        ListNode pre = preHead;
        
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                pre.next = list1;
                list1 = list1.next;
            } else {
                pre.next = list2;
                list2 = list2.next;
            }
            pre = pre.next;
        }

        pre.next = list1 == null ? list2 : list1;
        return preHead.next;
    }

}
