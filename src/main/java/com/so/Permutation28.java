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
     * @param str
     * @return
     */
    public static ArrayList<String> permutation2(String str) {
        ArrayList<String> result = new ArrayList<String>();
        if (str == null || str.length() == 0)
            return result;

        char[] chars = str.toCharArray();
        TreeSet<String> temp = new TreeSet<>();
        Permutation(chars, 0, temp);
        result.addAll(temp);
        return result;
    }

    public static void Permutation(char[] chars, int index, TreeSet<String> result) {
        if (chars == null || chars.length == 0)
            return;
        if (index < 0 || index > chars.length - 1)
            return;
        if (index == chars.length - 1) {
            result.add(String.valueOf(chars));
        } else {
            for (int i = index; i <= chars.length - 1; i++) {
                swap(chars, index, i);
                Permutation(chars, index + 1, result);
                // 回退
                swap(chars, index, i);
            }
        }
    }

    /**
     * 交换两个字符的位置
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