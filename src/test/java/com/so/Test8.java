package com.so;

import org.junit.Test;

/**
 * 第8题
 * 输入一个非递减排序数组的一个旋转，输出旋转数组的最小元素。
 *
 * @author qgl
 * @date 2019/02/22
 */
public class Test8 {
    @Test
    public void test8() throws Exception {
        int[] array = {6, 7, 9, 1, 3, 5, 5};
        System.out.println("旋转数组的最小元素：" + MinNumber8.minInReversingList(array));
    }
}
