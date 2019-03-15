package com.so;

import org.junit.Test;

/**
 * 第29题
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字
 *
 * @author qgl
 * @date 2019/03/15
 */
public class Test29 {
    @Test
    public void test29() throws Exception {
        int[] array = {1, 2, 3, 4, 5, 4, 5, 5, 5, 6, 7, 5, 5, 5};
        System.out.println("数组中出现次数超过数组长度一半的数字是：" + MoreThanHalfNum29.moreThanHalfNum(array));
    }
}
