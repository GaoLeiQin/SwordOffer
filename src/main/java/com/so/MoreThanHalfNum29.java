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
     * @param array
     * @return
     */
    public static Integer moreThanHalfNum(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        Integer number = null;
        int count = 0;
        Integer resultInteger = null;

        for (int i = 0; i < array.length; i++) {
            if (number == null) {
                number = array[i];
                count++;
            } else {
                if (array[i] != number) {
                    if (count == 0) {
                        number = array[i];
                        count = 1;
                    } else {
                        count--;
                    }
                } else {
                    count++;
                }
            }

            if (count == 1) {
                resultInteger = number;
            }
        }

        if (checkMoreThanHalf(array, resultInteger)) {
            return resultInteger;
        }
        return null;
    }

    /**
     * 检查输入的数字出现的次数是否超过数组长度一半
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
