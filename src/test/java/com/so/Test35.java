package com.so;

import org.junit.Test;

/**
 * 第35题
 * 在字符串中找出第一个只出现一次的字符
 *
 * @author qgl
 * @date 2019/03/21
 */
public class Test35 {
    @Test
    public void test35() throws Exception {
        String str = "abdbatccdeff";
        System.out.println("第一个只出现一次的字符的下标是：" + FirstNotRepeating35.getFirstNotRepeatingCharIndex(str));
    }
}
