package com.so;

import org.junit.Test;

/**
 * 第10题
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 * @author qgl
 * @date 2019/02/24
 */
public class Test10 {
    @Test
    public void test10() throws Exception {
        int number = 7;
        System.out.println(number + " 的二进制表示中1的个数：" + NumberOfBin10.numberOfBin(number));
    }
}
