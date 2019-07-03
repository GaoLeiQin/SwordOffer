package com.so;

import java.util.ArrayList;
import java.util.Stack;
import com.so.Common.ListNode;

/**
 * 第5题 从尾到头打印链表
 * 输入一个链表，从尾到头打印链表每个节点的值
 *
 * @author qgl
 * @date 2017/08/08
 */
public class PrintListReversing5 {

    /**
     * 解法一：利用栈输出
     * @param headNode
     */
    public static ArrayList<Integer> printListReverse1(ListNode headNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<ListNode> stack = new Stack<>();
        while (headNode != null) {
            stack.push(headNode);
            headNode = headNode.next;
        }

        while (!stack.isEmpty()) {
            list.add(stack.pop().val);
        }
        return list;
    }

    /**
     * 解法二：递归（其实底层还是栈）
     * @param headNode
     * @return
     */
    public static ArrayList<Integer> printListReverse2(ListNode headNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        if (headNode != null) {
            if (headNode.next != null) {
                list = printListReverse2(headNode.next);
            }
            list.add(headNode.val);
        }
        return list;
    }

}
