package com.so;

/**
 * 第14题
 * 输入一个整数数组，实现一个函数来调整数组中的数字的顺序，
 * 使得所有奇数位于数组的前半部分，偶数位于后半部分
 *
 * @author qgl
 * @date 2017/08/10
 */
public class OddEvenNumber14 {

    /**
     * 解法一：移动偶数位置
     * 时间复杂度 O（n²)，空间复杂度 O（1)
     *
     * @param array
     */
    public void reOrderArray(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            if (array[i] % 2 != 0) {
                while (j >= 0) {
                    if (array[j] % 2 != 0) {
                        break;
                    }
                    if (array[j] % 2 == 0) {
                        int t = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = t;
                        j--;
                    }
                }
            }
        }
    }

    /**
     * 解法二：双指针法
     * 时间复杂度 O（n)，空间复杂度 O（1)
     *
     * @param array
     */
    public void reOrderArray2(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (left < right && array[left] % 2 != 0) {
                left++;
            }
            while (left < right && array[right] % 2 == 0) {
                right--;
            }

            if (left < right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }
}
