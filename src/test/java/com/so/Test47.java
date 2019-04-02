package com.so;

import org.junit.Test;

/**
 * 第47题
 * 不用加减乘除做加法
 *
 * @author qgl
 * @date 2019/04/02
 */
public class Test47 {
    @Test
    public void test47() throws Exception {
        int num1 = 5;
        int num2 = 11;
        System.out.println("求和：" + num1 + " + " + num2 + " = " + Add47.add(num1, num2));
    }
}
