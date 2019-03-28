package com.so;

import org.junit.Test;

/**
 * 第42题
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变
 *
 * @author qgl
 * @date 2019/03/28
 */
public class Test42 {
    @Test
    public void test42() throws Exception {
        String str = "you maybe became a stronger";
        System.out.println("翻转句子的单词顺序：" + ReverseSentence42.reverseSentence(str));

        String rotationStr = "a pen I have ";
        System.out.println("字符串的左旋:" + ReverseSentence42.leftRotateString(rotationStr,5));
    }
}
