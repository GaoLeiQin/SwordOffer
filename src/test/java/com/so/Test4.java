package com.so;

import org.junit.Test;

/**
 * 第4题
 * 将一个字符串中的空格替换成"%20"
 *
 * @author qgl
 * @date 2019/02/18
 */
public class Test4 {
    @Test
    public void test4() {
        String beforeStr = " ab g gt r ";
        System.out.println("解法一：使用StringBuffer， 替换前：" + beforeStr + " 替换后：" + ReplaceBlank4.replaceBlank1(beforeStr));
        System.out.println("解法二：使用StringBuilder，替换前：" + beforeStr + " 替换后：" + ReplaceBlank4.replaceBlank2(beforeStr));
        System.out.println("解法三：从后往前复制，     替换前：" + beforeStr + " 替换后：" + ReplaceBlank4.replaceBlank3(beforeStr));
    }
}
