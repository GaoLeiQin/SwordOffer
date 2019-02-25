package com.so;

import org.junit.Test;

/**
 * 第11题
 * 求base的exponent次方，不得使用库函数，不需要考虑大数问题
 *
 * @author qgl
 * @date 2019/02/25
 */
public class Test11 {
    @Test
    public void test11() throws Exception {
        double base = 2.0;
        int exponent = 10;
        System.out.println(base + "^" + exponent + " = " + Power11.power(base, exponent));
    }
}
