package com.so;

/**
 * 第54题
 * 判断字符串是否表示数值（包括整数和小数）
 *
 * @author qgl
 * @date 2017/08/30
 */
public class IsNumber54 {

    /**
     * 解法一：逐个字符进行判断
     *
     * @param str
     * @return
     */
    public static boolean isNumber1(char[] str) {
        if (str == null) {
            return false;
        }
        int index = 0;
        int eCount = 0;
        int point = 0;
        // 如果第一个字符是符号就跳过
        if (str[0] == '-' || str[0] == '+')
            index++;

        for (int i = index; i < str.length; i++) {
            if (str[i] == '-' || str[i] == '+') {
                if (str[i - 1] != 'e' && str[i - 1] != 'E')
                    return false;
                continue;
            }

            if (str[i] == 'e' || str[i] == 'E') {
                eCount++;
                if (eCount > 1)
                    return false;
                if (i == 0 || str[i - 1] < 48 || str[i - 1] > 57 || i == str.length - 1)
                    return false;
                point++;
                continue;
            }

            if (str[i] == '.') {
                point++;
                if (point > 1)
                    return false;
                continue;
            }
            // 出现非数字且不是e/E则返回false（小数点和符号用continue跳过了）
            if ((str[i] < 48 || str[i] > 57) && (str[i] != 'e') && (str[i] != 'E'))
                return false;
        }
        return true;
    }

    /**
     * 解法二：正则表达式
        ？ 表示零次或一次匹配前面的字符或子表达式    * 表示零次或多次匹配前面的字符或子表达式
        + 表示一次或多次匹配前面的字符或子表达式    . 表示匹配除了换行符的任何单个字符
     *
     * @param str
     * @return
     */
    public static boolean isNumber2(char[] str) {
        String s = String.valueOf(str);
        return s.matches("[+-]?[0-9]*(\\.[0-9]*)?([eE][+-]?[0-9]+)?");
    }

}
