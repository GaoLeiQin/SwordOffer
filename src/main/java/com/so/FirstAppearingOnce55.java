package com.so;

/**
 * 第55题
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符
 *
 * @author qgl
 * @date 2017/08/30
 */
public class FirstAppearingOnce55 {
    static char[] chars = new char[256];
    static StringBuilder sb = new StringBuilder();

    /**
     * 输入字符流
     *
     * @param inputChars
     */
    public static void insertChars(char[] inputChars) {
        for (char ch : inputChars) {
            sb.append(ch);
            chars[ch]++;
        }
    }

    /**
     * 获取字符流中第一个不重复的字符
     *
     * @return
     */
    public static Character getFirstAppearingOnce() {
        char[] str = sb.toString().toCharArray();
        for (char c : str) {
            if (chars[c] == 1) {
                return c;
            }
        }
        return null;
    }
}
