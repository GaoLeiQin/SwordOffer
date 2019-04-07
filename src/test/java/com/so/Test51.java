package com.so;

import org.junit.Test;

import static com.so.MinCParent50.*;

/**
 * 第51题
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内，找出数组中任意一个重复的数字
 *
 * @author qgl
 * @date 2019/04/07
 */
public class Test51 {

    @Test
    public void test51() throws Exception {
        int[] arr = {6, 2, 3, 5, 2, 1, 5};
        System.out.println("解法一：数组中第一个重复的数字：" + Duplicate51.duplicate1(arr));
        System.out.println("解法二：数组中第一个重复的数字：" + Duplicate51.duplicate2(arr));
    }
}
