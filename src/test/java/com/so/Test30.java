package com.so;

import org.junit.Test;

import java.util.Arrays;

/**
 * 第30题
 * 输入N个整数，找出其中最小的k个数
 *
 * @author qgl
 * @date 2019/03/16
 */
public class Test30 {
    @Test
    public void test30() throws Exception {
        int[] array = {4, 5, 1, 6, 2, 7, 3, 2};
        int k = 3;
        System.out.println("最小的" + k + "个数是：" + GetLeastNumbers30.getLeastNumbers(array, k));
    }
}
