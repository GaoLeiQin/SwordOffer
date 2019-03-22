package com.so;

import java.util.Arrays;

/**
 * 第36题
 * 数组中的两个数字如果前面一个数字大于后面一个数字，
 * 则这两个数字组成一个逆序对，输入一个数组，求逆序对的总数
 *
 * @author qgl
 * @date 2017/08/15
 */
public class InversePairs36 {
    /**
     * 获取逆序对的总数
     * @param array
     * @return
     */
    public static int inversePairs(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        return getInversePairs(array, Arrays.copyOf(array, array.length), 0, array.length - 1) ;
    }

    private static int getInversePairs(int[] array, int[] copy, int low, int high) {
        if (low == high) {
            return 0;
        }
        int mid = (low + high) >> 1;
        int leftCount = getInversePairs(array, copy, low, mid);
        int rightCount = getInversePairs(array, copy, mid + 1, high);
        int count = 0;
        int i = mid;
        int j = high;
        int locCopy = high;
        while (i >= low && j > mid) {
            if (array[i] > array[j]) {
                count += j - mid;
                copy[locCopy--] = array[i--];
                // 防止数值过大而求余
                count %= 1000000007;
            } else {
                copy[locCopy--] = array[j--];
            }
        }

        for (int a  = i; a >= low; a--) {
            copy[locCopy--] = array[a];
        }
        for (int b = j; b > mid; b--) {
            copy[locCopy--] = array[b];
        }
        for (int s = low; s <= high; s++) {
            array[s] = copy[s];
        }
        return (leftCount + rightCount + count) % 1000000007;
    }

    /** 记录逆序对的数量 */
    private int count = 0;

    /**
     * 解法二：获取逆序对的总数
     *
     * @param array 输入的数组长度较大时有bug
     * @return
     */
    public int inversePairs2(int[] array) {
        if (array == null) {
            return 0;
        }
        mergeSort(array, 0, array.length - 1);
        return count;
    }

    private void mergeSort(int[] data, int start, int end) {
        int mid = (start + end) / 2;
        if (start < end) {
            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);
            merge(data, start, mid, end);
        }
    }

    public void merge(int[] data, int start, int mid, int end) {
        int arr[] = new int[end - start + 1];
        int c = 0;
        int s = start;
        int index = mid + 1;
        while (start <= mid && index <= end) {
            if (data[start] < data[index]) {
                arr[c++] = data[start++];
            } else {
                count += index - start;
                // 防止数值过大而求余
                count %= 1000000007;
                arr[c++] = data[index++];
            }
        }

        while (start <= mid) {
            arr[c++] = data[start++];
        }

        while (index <= end) {
            arr[c++] = data[index++];
        }

        for (int d : arr) {
            data[s++] = d;
        }
    }
}
