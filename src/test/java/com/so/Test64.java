package com.so;

import org.junit.Test;

/**
 * 第64题
 * 求数据流中的中位数
 *
 * @author qgl
 * @date 2019/04/20
 */
public class Test64 {

    @Test
    public void test64() throws Exception {
        int[] arr = {2, 4, 5, 8, 15, 10, 7, 9};
        GetMedian64.insertArray(arr);
        System.out.println("解法一：利用集合类的归并排序获取中位数：" + GetMedian64.getMedian1());
        System.out.println("解法二：利用优先级队列构建堆进行排序后获取中位数：" + GetMedian64.getMedian2());
    }
}
