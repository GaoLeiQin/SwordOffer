package com.so;

import org.junit.Test;
import com.so.PrintListReversing5.ListNode;

import java.util.Arrays;

/**
 * 第5题
 * 输入一个链表，从尾到头打印链表每个节点的值
 *
 * @author qgl
 * @date 2019/02/19
 */
public class Test5 {
    @Test
    public void test4() {
        int[] beforeList = {3, 6, 9};
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        ListNode node3 = new ListNode();
        node1.val = beforeList[0];
        node2.val = beforeList[1];
        node3.val = beforeList[2];
        node1.next = node2;
        node2.next = node3;
        System.out.println("解法一：利用栈输出，    原链表：" + Arrays.toString(beforeList) + " 反转后：" + PrintListReversing5.printListReverse1(node1));
        System.out.println("解法一：借助栈存入数组，原链表：" + Arrays.toString(beforeList) + " 反转后：" + PrintListReversing5.printListReverse2(node1));
        System.out.println("解法一：递归，          原链表：" + Arrays.toString(beforeList) + " 反转后：" + PrintListReversing5.printListReverse3(node1));
    }
}
