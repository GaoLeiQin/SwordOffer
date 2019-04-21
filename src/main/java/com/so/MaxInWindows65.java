package com.so;

import java.util.*;

/**
 * 第65题
 * 求滑动窗口的最大值
 *
 * @author qgl
 * @date 2017/08/31
 */
public class MaxInWindows65 {

    /**
     * 解法一：两个for循环
     *
     * @param num
     * @param size
     * @return
     */
    public static ArrayList<Integer> maxInWindows1(int[] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        if (num == null || size < 1 || num.length < size)
            return list;
        int length = num.length - size + 1;

        for (int i = 0; i < length; i++) {
            int current = size + i;
            int max = num[i];
            for (int j = i; j < current; j++) {
                if (max < num[j]) {
                    max = num[j];
                }
            }
            list.add(max);
        }
        return list;
    }

    /**
     * 解法二：时间复杂度更低的双端队列
     *
     * @param num
     * @param size
     * @return
     */
    public static ArrayList<Integer> maxInWindows2(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        if (size == 0) return res;
        ArrayDeque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < num.length; i++) {
            int begin = i - size + 1;
            if (q.isEmpty())
                q.add(i);
            else if (begin > q.peekFirst())
                q.pollFirst();

            while ((!q.isEmpty()) && num[q.peekLast()] <= num[i])
                q.pollLast();
            q.add(i);
            if (begin >= 0)
                res.add(num[q.peekFirst()]);
        }
        return res;
    }

}
