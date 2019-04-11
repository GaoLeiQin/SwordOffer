package com.so;

import org.junit.Test;

/**
 * 第55题
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符
 *
 * @author qgl
 * @date 2019/04/11
 */
public class Test55 {

    @Test
    public void test55() throws Exception {
        String str = "3A15t63e";
        String str2 = "3A61e5A613e5";
        FirstAppearingOnce55.insertChars(str.toCharArray());
        System.out.println("字符流中第一个只出现一次的字符是：" + FirstAppearingOnce55.getFirstAppearingOnce());
    }
}
