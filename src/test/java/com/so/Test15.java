package com.so;

import org.junit.Test;

import java.util.Arrays;

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
        FindKthToTail15.ListNode head = new FindKthToTail15.ListNode();
        FindKthToTail15.ListNode second = new FindKthToTail15.ListNode();
        FindKthToTail15.ListNode third = new FindKthToTail15.ListNode();
        FindKthToTail15.ListNode forth = new FindKthToTail15.ListNode();
        head.nextNode = second;
        second.nextNode = third;
        third.nextNode = forth;
        head.data = 1;
        second.data = 2;
        third.data = 3;
        forth.data = 4;
        System.out.println("解法一：" + FindKthToTail15.findKthToTail(head, 2).data);
        System.out.println("解法二：" + FindKthToTail15.findKthToTail2(head, 2).data);
    }
}
