package com.so;

/**
 * 第49题
 * 输入一个字符串,包括数字字母符号,可以为空,如果是合法的数值表达则返回该数字，否则返回0
 *
 * @author qgl
 * @date 2017/08/29
 */
public class StrToInt49 {

    /**
     * 将字符串转换为整数
     * @param str
     * @return
     */
    public static int StrToInt(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int mark = 0;
        int number = 0;
        char[] chars = str.toCharArray();

        if (chars[0] == '-') {
            mark = 1;
        }

        for (int i = mark; i < chars.length; i++) {
            if (chars[i] == '+') {
                continue;
            }

            if (chars[i] < 48 || chars[i] > 57) {
                return 0;
            }

            number = number * 10 + chars[i] - 48;
        }
        return mark == 0 ? number : -number;
    }

}
