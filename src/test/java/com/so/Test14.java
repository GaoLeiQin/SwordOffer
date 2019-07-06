package com.so;

import org.junit.Test;

import java.util.Arrays;

/**
 * 第14题
 * 输入一个整数数组，实现一个函数来调整数组中的数字的顺序，
 * 使得所有奇数位于数组的前半部分，偶数位于后半部分
 *
 * @author qgl
 * @date 2019/02/28
 */
public class Test14 {
    @Test
    public void test14() throws Exception {
        OddEvenNumber14 oddEvenNumber14 = new OddEvenNumber14();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        oddEvenNumber14.reOrderArray(array);
        System.out.println("解法一：移动偶数位置 " + Arrays.toString(array));

    }
}
