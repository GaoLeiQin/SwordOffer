package com.so;

import org.junit.Test;
import com.so.Common.ListNode;

/**
 * 第15题
 * 输入一个链表，输出该链表的倒数第K个结点
 *
 * @author qgl
 * @date 2019/03/01
 */
public class Test15 {
    @Test
    public void test15() throws Exception {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(4);
        head.next = second;
        second.next = third;
        third.next = forth;

        ListNode kthToTail = FindKthToTail15.findKthToTail(head, 5);
        System.out.println("解法一：" + Common.getAllListNode(kthToTail));
    }
}
