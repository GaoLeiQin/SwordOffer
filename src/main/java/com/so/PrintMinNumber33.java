package com.so;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 第33题
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印出能拼接出的所有数字中的最小的一个。
 *
 * @author qgl
 * @date 2017/08/14
 */
public class PrintMinNumber33 {
    /**
     * 解法一：自定义快排
     * @param array
     * @return
     */
    public static String printMinNumber1(int[] array) {
        int[] clone = array.clone();
        StringBuilder sb = new StringBuilder();
        printMin(clone, 0, clone.length - 1);
        for (int i : clone) {
            sb.append(i);
        }
        return sb.toString();
    }

    /**
     * 比较+快排
     * @param array
     * @param start
     * @param end
     */
    public static void printMin(int[] array, int start, int end) {
        if (start < end) {
            int main_number = array[end];
            int small_cur = start;
            for (int j = start; j < end; j++) {
                // array[j]、main_number的组合较小，就把array[j]换到最前面
                if (isSmall(String.valueOf(array[j]), String.valueOf(main_number))) {
                    int temp = array[j];
                    array[j] = array[small_cur];
                    array[small_cur] = temp;
                    small_cur++;
                }
            }

            array[end] = array[small_cur];
            array[small_cur] = main_number;
            printMin(array, 0, small_cur - 1);
            printMin(array, small_cur + 1, end);
        }
    }

    /**
     * 比较两个字符的大小(判断m是否比n小）
     * @param m
     * @param n
     * @return
     */
    private static boolean isSmall(String m, String n) {
        String left = m + n;
        String right = n + m;

        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) < right.charAt(i)) {
                return true;
            }
            if (left.charAt(i) > right.charAt(i))
                return false;
        }
        return false;
    }

    /**
     * 解法二：使用JDK的归并排序
     * @param numbers
     * @return
     */
    public static String printMinNumber2(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return "";
        int len = numbers.length;
        String[] str = new String[len];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String c1 = s1 + s2;
                String c2 = s2 + s1;
                return c1.compareTo(c2);
            }
        });

        for (int i = 0; i < len; i++) {
            sb.append(str[i]);
        }
        return sb.toString();
    }

}
