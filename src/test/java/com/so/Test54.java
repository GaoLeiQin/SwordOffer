package com.so;

import org.junit.Assert;
import org.junit.Test;

/**
 * 第54题
 * 判断字符串是否表示数值（包括整数和小数）
 *
 * @author qgl
 * @date 2019/04/10
 */
public class Test54 {

    @Test
    public void test54() throws Exception {
        String str = "3011o63l";
        String str2 = "123.45e+6";
        System.out.println("解法一：逐个字符进行判断 是否表示数值：" + IsNumber54.isNumber1(str.toCharArray()));
        System.out.println("解法二：用正则表达式判断 是否表示数值：" + IsNumber54.isNumber2(str.toCharArray()));

//        Assert.assertTrue(IsNumber54.isNumber1(str.toCharArray()));
    }
}
