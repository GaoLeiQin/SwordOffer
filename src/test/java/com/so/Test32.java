package com.so;

import org.junit.Test;

/**
 * 第32题
 * 输入一个整数n,求从1到n这N个十进制表示中1出现的次数
 *
 * @author qgl
 * @date 2019/03/18
 */
public class Test32 {
    @Test
    public void test32() throws Exception {
        System.out.println("解法一，1出现的次数：" + NumberOf1Bw32.NumberOf1Between1AndN1(13));
        System.out.println("解法二，1出现的次数：" + NumberOf1Bw32.NumberOf1Between1AndN2(13));
        System.out.println("解法三，1出现的次数：" + NumberOf1Bw32.NumberOf1Between1AndN3(13));
    }
}
