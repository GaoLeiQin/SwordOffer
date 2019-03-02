package com.so;

import org.junit.Test;

/**
 * 第16题
 * 输入一个链表的头结点，反转该链表并输出翻转后的头结点
 *
 * @author qgl
 * @date 2019/03/02
 */
public class Test16 {
    @Test
    public void test16() throws Exception {
        ReverseList16.ListNode head = new ReverseList16.ListNode();
        ReverseList16.ListNode second = new ReverseList16.ListNode();
        ReverseList16.ListNode third = new ReverseList16.ListNode();
        ReverseList16.ListNode forth = new ReverseList16.ListNode();
        head.nextNode = second;
        second.nextNode = third;
        third.nextNode = forth;
        head.data = 1;
        second.data = 2;
        third.data = 3;
        forth.data = 4;

        System.out.println("解法一：" + ReverseList16.reverseList1(head).data);
//        System.out.println("解法二：" + ReverseList16.reverseList2(head).data);
    }
}
