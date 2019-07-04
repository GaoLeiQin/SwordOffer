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
     * @param array
     * @param k
     * @return
     */
    public static ArrayList<Integer> getLeastNumbers(int[] array, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array == null || k < 0 || k > array.length) {
            return null;
        }
        int[] kArray = Arrays.copyOfRange(array, 0, k);

        //根据输入数组前k个数建立最大堆
        buildMaxHeapify(kArray);

        //从k开始与根节点比较，若大于根节点，舍去，若小于，取代根节点，重排最大堆
        for (int i = k; i < array.length; i++) {
            if (array[i] < kArray[0]) {
                kArray[0] = array[i];
                maxHeapIfy(kArray, 0);
            }
        }

        for (int i = kArray.length - 1; i >= 0; i--) {
            list.add(kArray[i]);
        }

        return list;
    }

    /**
     * 保持堆的性质
     * @param array
     * @param i
     */
    private static void maxHeapIfy(int[] array, int i) {
        int left = 2 * i + 1;
        int right = left + 1;
        int largest = 0;

        if (left < array.length && array[left] > array[i]) {
            largest = left;
        } else {
            largest = i;
        }

        if (right < array.length && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            maxHeapIfy(array, largest);
        }
    }

    /**
     * 构建大根堆
     * @param array
     */
    private static void buildMaxHeapify(int[] array) {
        //找到第一个非叶子节点
        for (int i = array.length / 2; i >= 0; i--) {
            maxHeapIfy(array, i);
        }
    }

}
