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
     * 解法一：双指针
     * 时间复杂度：O(mn)，空间复杂度：O(1)
     *
     * @param array
     * @param target
     * @return
     */
    public static boolean find(int[][] array, int target) {
        if (array == null || array.length == 0) {
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
     * 时间复杂度：O(log mn)，空间复杂度：O(1)
     *
     * @param array
     * @param target
     * @return
     */
    /*
    public static boolean find2(int[][] array, int target) {
        if (array == null || array.length == 0) {
            return false;
        }

        int left = 0;
        int right = array.length * array[0].length - 1;
        int col = array[0].length;

        while (left <= right) {
            int mid = (left + right) / 2;
            int value = array[mid / col][mid % col];

            if (value == target) {
                return true;
            } else if (value < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
    */
}
