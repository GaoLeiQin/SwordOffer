package com.so;

/**
 * 第66题
 * 判断在一个矩阵中是否存在一条包含某字符串所有字符的路径
 *
 * @author qgl
 * @date 2017/08/31
 */
public class HasPath66 {
    /**
     * 回溯法
     * @param matrix
     * @param rows
     * @param cols
     * @param str
     * @return
     */
    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        int flag[] = new int[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (helper(matrix, rows, cols, i, j, str, 0, flag))
                    return true;
            }
        }
        return false;
    }

    /**
     * 判断是否匹配
     * @param matrix
     * @param rows
     * @param cols
     * @param i
     * @param j
     * @param str
     * @param k
     * @param flag
     * @return
     */
    private static boolean helper(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, int[] flag) {
        int index = i * cols + j;
        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[index] != str[k] || flag[index] == 1)
            return false;

        if(k == str.length - 1)
            return true;
        flag[index] = 1;

        if (helper(matrix, rows, cols, i - 1, j, str, k + 1, flag)
                || helper(matrix, rows, cols, i + 1, j, str, k + 1, flag)
                || helper(matrix, rows, cols, i, j - 1, str, k + 1, flag)
                || helper(matrix, rows, cols, i, j + 1, str, k + 1, flag)) {
            return true;
        }
        flag[index] = 0;
        return false;
    }
}
