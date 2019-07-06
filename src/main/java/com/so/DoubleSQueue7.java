package com.so;

import java.util.Stack;

/**
 * 第7题
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 * @author qgl
 * @date 2017/08/09
 */
public class DoubleSQueue7 {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    /**
     * 入栈
     * 时间复杂度：O(1)，空间复杂度：O(n)
     *
     * @param node
     */
    public void push(int node) {
        stack1.push(node);
    }

    /**
     * 出栈
     * 时间（摊还）复杂度：O(1)，空间复杂度：O(1)
     *
     * @return
     * @throws Exception
     */
    public int pop() throws Exception {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new Exception("栈为空！");
        }

        if (stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
