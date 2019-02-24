package com.so;

import org.junit.Test;

/**
 * 第9题
 * 输入一个整数n，求斐波那契数列的第n项。
 *
 * @author qgl
 * @date 2019/02/23
 */
public class Test9 {
    @Test
    public void test9() throws Exception {
        int n = 9;
        System.out.println("解法一：三个局部变量，斐波那契数列的第 " + n + " 项是：" + Fibonacci9.getFibonacci1(n));
        System.out.println("解法二：两个局部变量，斐波那契数列的第 " + n + " 项是：" + Fibonacci9.getFibonacci2(n));
        System.out.println("解法三：    使用递归，斐波那契数列的第 " + n + " 项是：" + Fibonacci9.getFibonacci3(n));
    }
}
