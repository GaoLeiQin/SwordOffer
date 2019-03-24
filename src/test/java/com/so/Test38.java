package com.so;

import org.junit.Test;

/**
 * 第38题
 * 统计一个数字在排序数组中出现的次数
 *
 * @author qgl
 * @date 2019/03/24
 */
public class Test38 {
    @Test
    public void test38() throws Exception {
        int[] testArray = {1, 3, 3, 6, 7, 8, 8, 8, 8, 9};
        int num = 8;
        System.out.println("解法一：" + num + " 在排序数组中出现的次数：" + GetNumberOfK38.getNumberOfK(testArray, num));
    }
}
