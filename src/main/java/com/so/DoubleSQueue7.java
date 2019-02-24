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

    // 用两个栈实现一个队列，完成两个函数appendTail和deletedHead，
    // 分别是在队列尾部插入节点和在队列头部删除节点的功能
    private static Stack<Integer> stack1 = new Stack<>();
    private static Stack<Integer> stack2 = new Stack<>();

    public static void appendTail(int s) {
        stack1.push(s);
    }

    public static int deleteHead() throws Exception {
        // 优化点：可以将栈1底部的元素直接出栈，而不用导入栈2中再出栈
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            throw new Exception("队列为空，不能删除");
        }

        return stack2.pop();
    }
}
