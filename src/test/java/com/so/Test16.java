package com.so;

import org.junit.Test;
import com.so.Common.ListNode;

/**
 * 第16题 反转链表
 * 输入一个链表的头结点，反转该链表并输出翻转后的头结点
 *
 * @author qgl
 * @date 2019/03/02
 */
public class Test16 {
    @Test
    public void test16() throws Exception {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(4);
        head.next = second;
        second.next = third;
        third.next = forth;

        ListNode listNode = ReverseList16.reverseList1(head);
        System.out.println("解法一：" + Common.getAllListNode(listNode));
    }
}
