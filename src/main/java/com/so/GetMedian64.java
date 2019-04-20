package com.so;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 第64题
 * 求数据流中的中位数
 *
 * @author qgl
 * @date 2017/08/31
 */
public class GetMedian64 {

    /**
     * 插入数据
     *
     * @param arr
     */
    public static void insertArray(int[] arr) {
        for (int num : arr) {
            insertByMergeSort(num);
            insertByHeapSort(num);
        }
    }

    private static ArrayList<Integer> list = new ArrayList<>();

    /**
     * 对插入的数据进行（归并）排序
     *
     * @param num
     */
    private static void insertByMergeSort(Integer num) {
        list.add(num);
        Collections.sort(list);
    }

    /**
     * 解法一：利用集合类的排序方法
     *
     * @return
     */
    public static Double getMedian1() {
        int mid = list.size() / 2;

        if (list.size() % 2 == 0) {
            Double sum = Double.valueOf(list.get(mid)) + Double.valueOf(list.get(mid - 1));
            return sum / 2;
        }
        return Double.valueOf(list.get(mid));
    }

    private static int count = 0;
    private static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(16, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });

    /**
     * 对插入的数据进行（堆）排序
     *
     * @param num
     */
    private static void insertByHeapSort(Integer num) {
        count++;
        // 当数据的个数为奇数时，进入大根堆
        if ((count & 1) == 1) {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        } else {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }
    }

    /**
     * 解法二：利用优先级队列构建堆进行排序
     *
     * @return
     */
    public static Double getMedian2() {
        if (count == 0) {
            return null;
        }

        // 当数据个数是奇数时，中位数就是大根堆的顶点
        if ((count & 1) == 1) {
            return (double) maxHeap.peek();
        } else {
            return (double) (minHeap.peek() + maxHeap.peek()) / 2;
        }
    }

}
