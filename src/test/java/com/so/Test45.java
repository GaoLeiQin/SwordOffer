package com.so;

import org.junit.Test;

/**
 * 第45题
 * 0,1...n-1这n个数字排成一个圆圈，从数字0开始每次从这个圆圈里删除第m个数字．
 * 求这个圈圈里剩下的最后一个数字
 *
 * @author qgl
 * @date 2019/03/31
 */
public class Test45 {
    @Test
    public void test45() throws Exception {
        int n = 7;
        int m = 2;
        System.out.println("解法一，借助链表，圈圈里剩下的最后一个数字：" + LastRemaining45.lastRemain1(n,m));
        System.out.println("解法二，公式法，圈圈里剩下的最后一个数字：" + LastRemaining45.lastRemain2(n,m));
    }
}
