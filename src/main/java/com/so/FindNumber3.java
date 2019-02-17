package com.so;

/**
 * 第3题
 * 一个二维数组，每一行从左到右递增，每一列从上到下递增．
 * 输入一个二维数组和一个整数，判断数组中是否含有整数
 *
 * @author qgl
 * @date 2017/08/07
 */
public class FindNumber3 {

    /**
     * 解法一：两个指针
     * @param array
     * @param target
     * @return
     */
    public static boolean find(int[][] array, int target) {
        if (array == null) {
            return false;
        }
        int row = 0;
        int column = array[0].length - 1;

        while (row < array.length && column >= 0) {
            if (array[row][column] == target) {
                return true;
            }
            if (array[row][column] > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }

    /**
     * 解法二：二分法
     * @param target
     * @param array
     * @return
     */
    public static boolean find(int target, int[][] array) {
        if (array == null) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            int left = 0;
            int right = array[i].length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (target > array[i][mid])
                    left = mid + 1;
                else if (target < array[i][mid])
                    right = mid - 1;
                else
                    return true;
            }
        }
        return false;
    }
}
