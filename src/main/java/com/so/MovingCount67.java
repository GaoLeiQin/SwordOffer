package com.so;

/**
 * 第67题
 * 机器人的运动范围，一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。求机器人能够达到多少个格子
 *
 * @author qgl
 * @date 2017/08/31
 */
public class MovingCount67 {

    /**
     * 机器人能到达的格子数
     * @param k
     * @param rows
     * @param cols
     * @return
     */
    public static int movingCount(int k, int rows, int cols) {
        int[][] flag = new int[rows][cols]; // 记录是否已经走过
        return helper(0, 0, rows, cols, flag, k);
    }

    /**
     * 递归查找
     * @param i
     * @param j
     * @param rows
     * @param cols
     * @param flag
     * @param k
     * @return
     */
    private static int helper(int i, int j, int rows, int cols, int[][] flag, int k) {
        if (i < 0 || i >= rows || j < 0 || j >= cols ||
                numSum(i) + numSum(j) > k || flag[i][j] == 1) {
            return 0;
        }
        flag[i][j] = 1;
        return helper(i - 1, j, rows, cols, flag, k)
                + helper(i + 1, j, rows, cols, flag, k)
                + helper(i, j - 1, rows, cols, flag, k)
                + helper(i, j + 1, rows, cols, flag, k) + 1;
    }

    /**
     * 求输入数的每一位之和
     * @param i
     * @return
     */
    private static int numSum(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i = i / 10;
        }
        return sum;
    }
}
