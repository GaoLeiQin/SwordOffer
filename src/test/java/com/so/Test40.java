package com.so;

import org.junit.Test;

import java.util.Arrays;

/**
 * 第40题
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次，找出这两个只出现了一次的数字
 *
 * @author qgl
 * @date 2019/03/26
 */
public class Test40 {
    @Test
    public void test40() throws Exception {
        int[] array = {4, 6, 7, 4, 9, 8, 6, 8};
        System.out.println("只出现了一次的数字：" + Arrays.toString(FindNumAppearOnce40.findNumAppearOnce(array)));
    }
}
