package com.so;

import com.so.Common.ListNode;
import org.junit.Test;

/**
 * 第5题 从尾到头打印链表
 * 输入一个链表，从尾到头打印链表每个节点的值
 *
 * @author qgl
 * @date 2019/02/19
 */
public class Test5 {
    @Test
    public void test5() {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        System.out.println("解法一：利用栈输出，反转后：" + PrintListReversing5.printListReverse1(node1));
        System.out.println("解法二：递归，反转后：" + PrintListReversing5.printListReverse2(node1));
    }
}
