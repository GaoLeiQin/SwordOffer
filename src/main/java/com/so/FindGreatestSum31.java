package com.so;

/**
 * 第31题
 * 数组中一个或连续的多个整数组成一个子数组，求连续子数组的最大和
 *
 * @author qgl
 * @date 2017/08/14
 */
public class FindGreatestSum31 {
    /**
     * 获取连续子数组的最大和
     *
     * @param array
     * @return
     */
    public static Integer findGreatestSum(int[] array) {
        if (array == null) {
            return null;
        }
        int greatest = 0;
        int curSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (curSum + array[i] < 0) {
                greatest = 0;
                curSum = 0;
            } else {
                curSum += array[i];
                greatest = Math.max(greatest, curSum);
            }
        }

        return greatest;
    }
}