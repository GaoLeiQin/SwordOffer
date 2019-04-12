package com.so;

import org.junit.Test;

/**
 * 第56题
 * 找出环链表的入口结点
 *
 * @author qgl
 * @date 2019/04/12
 */
public class Test56 {

    @Test
    public void test56() throws Exception {
        EnterLoop56.ListNode root = new EnterLoop56.ListNode(6);
        EnterLoop56.ListNode first = new EnterLoop56.ListNode(1);
        EnterLoop56.ListNode second = new EnterLoop56.ListNode(2);
        EnterLoop56.ListNode three = new EnterLoop56.ListNode(3);
        EnterLoop56.ListNode four = new EnterLoop56.ListNode(4);
        root.next = first;
        first.next = second;
        second.next = three;
        three.next = four;
        four.next = root;

        System.out.println("环链表的入口结点：" + EnterLoop56.enterNodeOfLoop(root).val);
    }
}
