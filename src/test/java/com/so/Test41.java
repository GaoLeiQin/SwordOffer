package com.so;

import org.junit.Test;

/**
 * 第41题
 * 输入一个递增排序的数组和一个数字s.在数组中查找两个数使他们的和为s，如果有多对数字的和等于s，输出两个数的乘积最小的一对
 *
 * @author qgl
 * @date 2019/03/27
 */
public class Test41 {
    @Test
    public void test41() throws Exception {
        int[] array = {1, 2, 4, 6, 7, 8, 12, 15};
        int s = 10;
        System.out.println("和为s的两个数：" + FindNumbersWithSum41.findNumbersWithSum(array, s));
        System.out.println("所有和为s的连续正数序列：" + FindNumbersWithSum41.findContinuousSequence(s));
    }
}
