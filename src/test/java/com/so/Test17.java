package com.so;

import org.junit.Test;
import com.so.Common.ListNode;

/**
 * 第17题
 * 输入两个递增的链表，合并这两个链表并使新链表仍然是递增的
 *
 * @author qgl
 * @date 2019/03/03
 */
public class Test17 {
    @Test
    public void test17() throws Exception {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(5);
        ListNode forth = new ListNode(7);
        head.next = second;
        second.next = third;
        third.next = forth;

        ListNode head2 = new ListNode(2);
        ListNode second2 = new ListNode(4);
        ListNode third2= new ListNode(6);
        ListNode forth2 = new ListNode(8);
        head2.next = second2;
        second2.next = third2;
        third2.next = forth2;

        ListNode listNode = MergeLinked17.mergeTwoLists(head, head2);
        System.out.println("解法一：" + Common.getAllListNode(listNode));
    }
}
