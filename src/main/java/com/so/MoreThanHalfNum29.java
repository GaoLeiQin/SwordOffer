package com.so;

/**
 * 第29题
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字
 *
 * @author qgl
 * @date 2017/08/14
 */
public class MoreThanHalfNum29 {
    /**
     * 获取数组中出现次数超过数组长度一半的数字
     *
     * @param nums
     * @return
     */
    public static int moreThanHalfNum(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return checkMoreThanHalf(nums, candidate) ? candidate : 0;
    }

    /**
     * 检查输入的数字出现的次数是否超过数组长度一半
     *
     * @param array
     * @param number
     * @return
     */
    private static boolean checkMoreThanHalf(int[] array, Integer number) {
        int times = 0;
        for (int i : array) {
            if (i == number) {
                times++;
            }
        }
        return times * 2 >= array.length;
    }
}
