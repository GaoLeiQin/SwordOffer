package com.so;

/**
 * 第52题
 * 构建乘积数组
 *
 * @author qgl
 * @date 2017/08/29
 */
public class MultiplyArray52 {

    /**
     * 利用矩阵法构建乘积数组
     *
     * @param A
     * @return
     */
    public static int[] multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        if (length != 0) {
            B[0] = 1;
            //计算下三角连乘
            for (int i = 1; i < length; i++) {
                B[i] = B[i - 1] * A[i - 1];
            }
            int temp = 1;
            //计算上三角连乘
            for (int j = length - 2; j >= 0; j--) {
                temp *= A[j + 1];
                B[j] *= temp;
            }
        }
        return B;
    }
}
