package com.so;

import java.util.*;

/**
 * 第28题
 * 输入一个字符串，打印出字符串中字符的所有排列
 *
 * @author qgl
 * @date 2017/08/14
 */
public class Permutation28 {

    /**
     * 解法一：while循环
     *
     * @param str
     * @return
     */
    public static String permutation1(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (str.length() == 1) {
            sb.append(str);
            return String.valueOf(sb);
        }

        char[] output = str.toCharArray();
        int point = 0;
        sb.append(output).append(",");
        swap(output, point, ++point);

        while (!String.valueOf(output).equals(str)) {
            sb.append(output).append(",");
            if (point == output.length - 1) {
                swap(output, point, 0);
                point = 0;
            } else {
                swap(output, point, ++point);
            }
        }

        return String.valueOf(sb);
    }

    /**
     * 解法二：递归
     *
     * @param str
     * @return
     */
    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return res;
        }
        helper(res, 0, str.toCharArray());
        // 符合结果的输出顺序
        Collections.sort(res);
        return res;

    }

    private static void helper(ArrayList<String> res, int index, char[] s) {
        if (index == s.length - 1) {
            res.add(String.valueOf(s));
            return;
        }

        for (int i = index; i < s.length; i++) {
            if (i == index || s[index] != s[i]) {
                swap(s, index, i);
                helper(res, index + 1, s);
                swap(s, index, i);
            }
        }
    }

    /**
     * 交换两个字符的位置
     *
     * @param output
     * @param i
     * @param j
     */
    public static void swap(char[] output, int i, int j) {
        char temp = output[i];
        output[i] = output[j];
        output[j] = temp;
    }
}