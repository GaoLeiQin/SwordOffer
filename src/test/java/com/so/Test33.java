package com.so;

import org.junit.Test;

/**
 * 第33题
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印出能拼接出的所有数字中的最小的一个。
 *
 * @author qgl
 * @date 2019/03/19
 */
public class Test33 {
    @Test
    public void test32() throws Exception {
        int[] array = {3, 19, 32, 5, 26};
        System.out.println("解法一，自定义快排：" + PrintMinNumber33.printMinNumber1(array));
        System.out.println("解法二，JDK的归排：" + PrintMinNumber33.printMinNumber2(array));
    }
}
