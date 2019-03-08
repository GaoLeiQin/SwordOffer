package com.so;

import org.junit.Test;

/**
 * 第22题
 * 输入两个整数序列，第一个序列表示压入顺序，判断第二个序列是否为弹出顺序
 *
 * @author qgl
 * @date 2019/03/08
 */
public class Test22 {
    @Test
    public void test22() throws Exception {
        int[] pushList = {1, 2, 3, 4, 5};
        int[] popList = {4, 3, 5, 2, 1};

        System.out.println("是否是弹出顺序：" + IsPopOrder22.isPopOrder(pushList, popList));
    }
}
