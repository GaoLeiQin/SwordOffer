package com.so;

import java.util.LinkedList;

/**
 * 第45题
 * 0,1...n-1这n个数字排成一个圆圈，从数字0开始每次从这个圆圈里删除第m个数字．
 * 求这个圈圈里剩下的最后一个数字
 *
 * @author qgl
 * @date 2017/08/16
 */
public class LastRemaining45 {

    /**
     * 解法一：借助链表
     * @param n
     * @param m
     * @return
     */
    public static int lastRemain1(int n, int m) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        int index = 0;

        for (int i = 0; i < n; i ++) {
            list.add(i);
        }

        while (list.size() > 1) {
            index = (index + m - 1) % list.size();
            list.remove(index);
        }
        return list.size() == 1 ? list.get(0) : -1;
    }

    /**
     * 解法二：公式法
     * @param n
     * @param m
     * @return
     */
    public static int lastRemain2(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }
        int last = 0;
        for (int i = 2; i <= n; i ++) {
            // i个人时删除数的索引等于i-1个人时删除数的索引+k(再对i取余)
            last = (last + m) % i;
        }
        return last;
    }

}
