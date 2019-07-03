package com.so;

import org.junit.Test;

/**
 * 第24题
 * 输入一个数组，判断数组是不是二叉搜索树的后序遍历结果
 *
 * @author qgl
 * @date 2019/03/10
 */
public class Test24 {
    @Test
    public void test24() throws Exception {
        int[] array = {4, 8, 6, 12, 16, 14, 10};
        System.out.println("结果：" + VerifySequenceOfBST24.VerifySquenceOfBST(array));
    }
}
