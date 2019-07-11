package com.so;

import org.junit.Test;

/**
 * 第46题
 * 求1+2+...+n，不能使用乘除法，循环等
 *
 * @author qgl
 * @date 2019/04/01
 */
public class Test46 {
    @Test
    public void test46() throws Exception {
        int n = 10;
        System.out.println("解法一，利用递归，求1 + ...+ " + n + " 的和：" + Calculate46.sum(n));
        System.out.println("解法二，利用递归和全局变量，求1 + ...+ " + n + " 的和：" + Calculate46.sum2(n));
    }
}
