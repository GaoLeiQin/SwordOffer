package com.so;

import org.junit.Test;

import java.util.Arrays;

/**
 * 第31题
 * 数组中一个或连续的多个整数组成一个子数组，求连续子数组的最大和
 *
 * @author qgl
 * @date 2019/03/17
 */
public class Test31 {
    @Test
    public void test30() throws Exception {
        int[] array = {1, -2, 3, 10, -4, 7, 2, -5};
        System.out.println("连续子数组的最大和是：" + FindGreatestSum31.findGreatestSum(array));
    }
}
