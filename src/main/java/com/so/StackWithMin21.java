package com.so;

import java.util.Stack;

/**
 * 第21题
 * 定义一个栈，在该类型中实现一个能够得到栈的最小元素的Min函数。
 *
 * @author qgl
 * @date 2017/08/10
 */
public class StackWithMin21 {

    /**
     * 解法一：栈使用JDK的 Stack
     */
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void push(int node) {
        stack1.push(node);
        if (stack2.isEmpty()) {
            stack2.push(node);
        } else {
            if (stack2.peek() > node) {
                stack2.push(node);
            }
        }
    }

    public static void pop() {
        if (stack1.pop() == stack2.peek()) {
            stack2.pop();
        }
    }

    public static int top() {
        return stack1.peek();
    }

    public static int min() {
        return stack2.peek();
    }

    /**
     * 解法二：栈使用自定义的 MyStack
     */
    private static MyStack<Integer> minStack = new MyStack<>();
    private static MyStack<Integer> dataStack = new MyStack<>();

    public static void push2(Integer item) {
        dataStack.push(item);
        if (minStack.length == 0 || item <= minStack.head.data) {
            minStack.push(item);
        } else {
            minStack.push(minStack.head.data);
        }
    }

    public static Integer pop2() {
        if (dataStack.length == 0 || minStack.length == 0)
            return null;
        minStack.pop();
        return dataStack.pop();
    }

    public static Integer min2() {
        if (minStack.length == 0)
            return null;
        return minStack.head.data;
    }

    static class MyStack<K> {
        public ListNode<K> head;
        public int length;

        public void push(K item) {
            ListNode<K> node = new ListNode<K>();
            node.data = item;
            node.nextNode = head;
            head = node;
            length++;
        }

        public K pop() {
            if (head == null)
                return null;
            ListNode<K> temp = head;
            head = head.nextNode;
            length--;
            return temp.data;

        }
    }

    static class ListNode<K> {
        K data;
        ListNode<K> nextNode;
    }

}

