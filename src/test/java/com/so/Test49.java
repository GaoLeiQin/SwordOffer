package com.so;

import org.junit.Test;

/**
 * 第49题
 * 将一个字符串转换成一个整数。数值为0或者字符串不是一个合法的数值则返回0
 *
 * @author qgl
 * @date 2019/04/04
 */
public class Test49 {

    @Test
    public void test49() throws Exception {
        String str = "+015303";
        String str2 = "p015c303";
        System.out.println("字符串转换为整数:" + StrToInt49.StrToInt(str));
    }
}
