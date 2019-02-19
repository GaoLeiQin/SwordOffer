package com.so;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 第5题
 * 输入一个链表，从尾到头打印链表每个节点的值
 *
 * @author qgl
 * @date 2017/08/08
 */
public class PrintListReversing5 {

    static class ListNode {
        public int val;
        public ListNode next;
    }

    /**
     * 解法一：利用栈输出
     * @param headNode
     */
    public static ArrayList<Integer> printListReverse1(ListNode headNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<ListNode> stack = new Stack<ListNode>();
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
     * 解法二：借助栈存入数组
     * @param listNode
     * @return
     */
    public static ArrayList<Integer> printListReverse2(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode == null)
            return list;
        Stack<ListNode> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode);
            listNode = listNode.next;
        }

        while (!stack.isEmpty()) {
            list.add(stack.pop().val);
        }
        return list;
    }

    /**
     * 解法三：递归（其实底层还是栈）
     * @param listNode
     * @return
     */
    public static ArrayList<Integer> printListReverse3(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        ListNode pNode = listNode;
        if (pNode != null) {
            if (pNode.next != null) {
                list = printListReverse3(pNode.next);
            }
            list.add(pNode.val);
        }
        return list;
    }

}
