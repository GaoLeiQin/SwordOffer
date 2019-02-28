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
     * 利用辅助函数
     * @param array
     */
    public static int[] order1(int[] array) {
        if(array == null)
            return null;
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            while (start < end && isEven(array[end])) {
                end--;
            }
            while (start < end && !isEven(array[start])) {
                start++;
            }
            if(start < end) {
                int temp=array[start];
                array[start]=array[end];
                array[end]=temp;
            }
        }

        return array;
    }

    /**
     * 辅助函数的实现
     * @param n
     * @return
     */
    private static boolean isEven(int n) {
        return n%2 == 0;
    }

    /**
     * 解法二： 无辅助函数
     * @param array
     */
    public static int[] order2(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            if (array[left] % 2 != 0) {
                left++;
            }else {
                if (array[right] % 2 != 0) {
                    int temp = array[right];
                    array[right] = array[left];
                    array[left] = temp;
                }else {
                    right--;
                }
            }
        }

        return array;
    }

    /**
     * 解法三：利用辅助数组
     * @param array 返回的数组顺序是原数组顺序
     */
    public static int[] order3(int [] array) {
        int index = 0;
        int length = array.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 != 0)
                count++;
        }
        int[] data = new int[array.length];
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 != 0)
                data[index++] = array[i];
            else
                data[count++] = array[i];
        }

        for (int i = 0; i < length; i++) {
            array[i] = data[i];
        }

        return data;
    }
}
