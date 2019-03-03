package com.so;

/**
 * 第17题
 * 输入两个递增的链表，合并这两个链表并使新链表仍然是递增的
 *
 * @author qgl
 * @date 2017/08/10
 */
public class MergeLinked17 {
    /**
     * 链表
     */
    static class ListNode {
        int data;
        ListNode nextNode;
    }

    /**
     * 解法一：递归
     *
     * @param root1
     * @param root2
     * @return
     */
    public static ListNode mergeTwoLists1(ListNode root1, ListNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }

        ListNode mergeHead = null;

        if (root1.data <= root2.data) {
            mergeHead = root1;
            mergeHead.nextNode = mergeTwoLists1(root1.nextNode, root2);
        } else {
            mergeHead = root2;
            mergeHead.nextNode = mergeTwoLists1(root1, root2.nextNode);
        }

        return mergeHead;
    }

    /**
     * 解法二 ： 非递归
     *
     * @param n1
     * @param n2
     * @return
     */
    public static ListNode mergeTwoLists2(ListNode n1, ListNode n2) {
        ListNode newHead = null;
        if (n1 == null) {
            return n2;
        }
        if (n2 == null) {
            return n1;
        }
        if (n1.data <= n2.data) {
            newHead = n1;
            n1 = n1.nextNode;
        } else {
            newHead = n2;
            n2 = n2.nextNode;
        }

        //temp永远指向最新合并的结点
        ListNode temp = newHead;
        while (n1 != null && n2 != null) {
            if (n1.data <= n2.data) {
                temp.nextNode = n1;
                n1 = n1.nextNode;
            } else {
                temp.nextNode = n2;
                n2 = n2.nextNode;
            }

            temp = temp.nextNode;
        }

        if (n1 != null) {
            temp.nextNode = n1;
        }

        if (n2 != null) {
            temp.nextNode = n2;
        }
        return newHead;
    }

}
