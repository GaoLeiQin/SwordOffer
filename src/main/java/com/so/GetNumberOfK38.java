package com.so;

import java.util.Arrays;

/**
 * 第38题
 * 统计一个数字在排序数组中出现的次数
 *
 * @author qgl
 * @date 2017/08/15
 */
public class GetNumberOfK38 {
    //
    public static int getNumberOfK(int[] arraySorted, int k) {
        // 若数组为空
        if (arraySorted == null || arraySorted.length == 0) {
            return 0;
        }
        // 若数组中只有一个数
        if (arraySorted.length == 1) {
            if (arraySorted[0] == k) {
                return 1;
            }
            return 0;
        }

        int result = 0;
        int mid = arraySorted.length / 2;

        if (k < arraySorted[mid]) {
            getNumberOfK(Arrays.copyOfRange(arraySorted, 0, mid), k);
        } else if (k > arraySorted[mid]) {
            getNumberOfK(Arrays.copyOfRange(arraySorted, mid, arraySorted.length), k);
        } else {
            result += getCount(arraySorted, mid);
        }

        return result;
    }

    /**
     * K与中间的值相等时，从中间值前后分别查找
     *
     * @param arraySorted
     * @param mid
     * @return
     */
    private static int getCount(int[] arraySorted, int mid) {
        int k = arraySorted[mid];
        int result = 0;

        for (int i = mid; i < arraySorted.length; i++) {
            if (arraySorted[i] == k) {
                result++;
            } else {
                break;
            }
        }

        for (int i = mid - 1; i >= 0; i--) {
            if (arraySorted[i] == k) {
                result++;
            } else {
                break;
            }
        }
        return result;
    }
}