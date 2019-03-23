package com.so;

import org.junit.Test;

/**
 * 第37题
 * 求两个单向链表的第一个公共节点
 *
 * @author qgl
 * @date 2019/03/23
 */
public class Test37 {
    @Test
    public void test37() throws Exception {
        FindFirstCommonNode37.ListNode head1 = new FindFirstCommonNode37.ListNode(1);
        FindFirstCommonNode37.ListNode second1 = new FindFirstCommonNode37.ListNode(2);
        FindFirstCommonNode37.ListNode third1 = new FindFirstCommonNode37.ListNode(3);
        FindFirstCommonNode37.ListNode forth1 = new FindFirstCommonNode37.ListNode(6);
        FindFirstCommonNode37.ListNode fifth1 = new FindFirstCommonNode37.ListNode(7);
        FindFirstCommonNode37.ListNode head2 = new FindFirstCommonNode37.ListNode(1);
        FindFirstCommonNode37.ListNode second2 = new FindFirstCommonNode37.ListNode(5);
        FindFirstCommonNode37.ListNode third2 = new FindFirstCommonNode37.ListNode(6);
        FindFirstCommonNode37.ListNode forth2 = new FindFirstCommonNode37.ListNode(8);
        head1.next = second1;
        second1.next = third1;
        third1.next = forth1;
        forth1.next = fifth1;
        head2.next = second2;
        second2.next = forth1;
        third2.next = forth2;

        System.out.println("解法一：第一个公共节点是：" + FindFirstCommonNode37.findFirstCommonNode1(head1, head2).val);
        System.out.println("解法二：第一个公共节点是：" + FindFirstCommonNode37.findFirstCommonNode2(head1, head2).val);
    }
}
