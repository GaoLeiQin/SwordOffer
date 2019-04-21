package com.so;

import org.junit.Test;

/**
 * 第65题
 * 求滑动窗口的最大值
 *
 * @author qgl
 * @date 2019/04/21
 */
public class Test65 {

    @Test
    public void test65() throws Exception {
        int[] arr = {2, 3, 4, 2, 6, 2, 5, 1};
        int windowsSize = 3;
        System.out.println("解法一：两个for循环，获取滑动窗口的最大值:" + MaxInWindows65.maxInWindows1(arr, windowsSize));
        System.out.println("解法二：双端队列，获取滑动窗口的最大值:" + MaxInWindows65.maxInWindows2(arr, windowsSize));
    }
}
