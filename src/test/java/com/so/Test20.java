package com.so;

import org.junit.Test;

/**
 * 第20题
 * 顺时针打印矩阵
 *
 * @author qgl
 * @date 2019/03/06
 */
public class Test20 {
    @Test
    public void test20() throws Exception {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println("顺时针输出矩阵：" + PrintMatrixInCircle20.printMatrix(array));
    }
}
