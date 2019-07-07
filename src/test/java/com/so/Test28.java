package com.so;

import org.junit.Test;

/**
 * 第28题
 * 输入一个字符串，打印出字符串中字符的所有排列
 *
 * @author qgl
 * @date 2019/03/14
 */
public class Test28 {
    @Test
    public void test28() throws Exception {
        String testStr = "try";
        System.out.println("解法一：while循环，结果：" + Permutation28.permutation1(testStr));
        System.out.println("解法二：递归，结果：" + Permutation28.Permutation(testStr));
    }
}
