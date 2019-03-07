package com.so;

import org.junit.Test;

/**
 * 第21题
 * 定义一个栈，在该类型中实现一个能够得到栈的最小元素的Min函数。
 *
 * @author qgl
 * @date 2019/03/07
 */
public class Test21 {
    @Test
    public void test21() throws Exception {
        StackWithMin21.push(3);
        StackWithMin21.push(1);
        StackWithMin21.push(4);
        StackWithMin21.push(9);
        System.out.println("解法一，使用JDK的 Stack 栈，最小值：" + StackWithMin21.min());

        StackWithMin21.push2(3);
        StackWithMin21.push2(1);
        StackWithMin21.push2(4);
        StackWithMin21.push2(9);
        System.out.println("解法二，自定义的 MyStack 栈，最小值：" + StackWithMin21.min2());
    }
}
