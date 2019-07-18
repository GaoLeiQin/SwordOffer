package com.so;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 第30题
 * 输入N个整数，找出其中最小的k个数
 *
 * @author qgl
 * @date 2017/08/14
 */
public class GetLeastNumbers30 {

    /**
     * 获取最小的k个数
     *
     * @param array
     * @param k
     * @return
     */
    public static ArrayList<Integer> getLeastNumbers(int[] array, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array == null || k < 1 || k > array.length) {
            return list;
        }
        int[] kArray = Arrays.copyOfRange(array, 0, k);

        //根据输入数组前k个数建立最大堆
        for (int i = kArray.length / 2; i >= 0; i--) {
            maxHeapIfy(kArray, i, kArray.length);
        }

        //从k开始与根节点比较，若大于根节点，舍去，若小于，取代根节点，重排最大堆
        for (int i = k; i < array.length; i++) {
            if (array[i] < kArray[0]) {
                kArray[0] = array[i];
                maxHeapIfy(kArray, 0, kArray.length);
            }
        }

        for (int i = kArray.length - 1; i >= 0; i--) {
            list.add(kArray[i]);
        }

        return list;
    }

    /**
     * 调整大根堆
     *
     * @param array
     * @param root
     * @param length
     */
    private static void maxHeapIfy(int[] array, int root, int length) {
        int left = 2 * root + 1;

        if (left >= length) {
            return;
        }

        if (left + 1 < length && array[left] < array[left + 1]) {
            left++;
        }

        if (array[left] > array[root]) {
            swap(array, left, root);
            maxHeapIfy(array, left, length);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
