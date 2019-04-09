package com.so;

import org.junit.Test;

import java.util.Arrays;

/**
 * 第53题
 * 正则表达式匹配字符串,实现一个函数用来匹配包括'.'和'*'的正则表达式
 * 其中'*'表示它前面的字符可以出现任意次（包含0次）
 *
 * @author qgl
 * @date 2019/04/09
 */
public class Test53 {

    @Test
    public void test53() throws Exception {
        String str = "aaa";
        String pattern = "a.a";
        System.out.println("是否匹配：" + RegularMatch53.match(str.toCharArray(),pattern.toCharArray()));
    }
}
