package com.so;

import java.util.ArrayList;

/**
 * 第20题
 * 顺时针打印矩阵
 *
 * @author qgl
 * @date 2017/08/10
 */
public class PrintMatrixInCircle20 {

    /**
     * 打印矩阵
     * @param matrix
     * @return
     */
    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix == null)
            return list;
        int start = 0;
        while (matrix[0].length > start * 2 && matrix.length > start * 2) {
            saveOneCircle(matrix, start, list);
            start++;
        }
        return list;
    }

    /**
     * 记录矩阵的环
     * @param matrix
     * @param start
     * @param list
     */
    private static void saveOneCircle(int[][] matrix, int start, ArrayList<Integer> list) {
        int endX = matrix[0].length - 1 - start; // 列
        int endY = matrix.length - 1 - start;  // 行
        // 从左往右
        for (int i = start; i <= endX; i++)
            list.add(matrix[start][i]);
        // 从上往下
        if (start < endY) {
            for (int i = start + 1; i <= endY; i++)
                list.add(matrix[i][endX]);
        }
        // 从右往左（判断是否会重复打印）
        if (start < endX && start < endY) {
            for (int i = endX - 1; i >= start; i--)
                list.add(matrix[endY][i]);
        }
        // 从下往上（判断是否会重复打印）
        if (start < endX && start < endY - 1) {
            for (int i = endY - 1; i >= start + 1; i--)
                list.add(matrix[i][start]);
        }
    }

}
