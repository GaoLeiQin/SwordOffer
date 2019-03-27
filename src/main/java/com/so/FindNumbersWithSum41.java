package com.so;

import java.util.ArrayList;

/**
 * 第41题
 * 41.1 输入一个递增排序的数组和一个数字s.在数组中查找两个数使他们的和为s，如果有多对数字的和等于s，输出两个数的乘积最小的一对
 * 41.2 输入一个整数s，求所有和为s的连续正数序列
 * @author qgl
 * @date 2017/08/16
 */
public class FindNumbersWithSum41 {

    /**
     * 获取和为s的两个数
     * @param sortedArray
     * @param s
     * @return
     */
    public static ArrayList<Integer> findNumbersWithSum(int[] sortedArray, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        if (sortedArray == null) {
            return list;
        }
        int left = 0;
        int right = sortedArray.length - 1;

        while (right > left) {
            long curSum = sortedArray[right] + sortedArray[left];
            if (curSum == s) {
                list.add(sortedArray[left]);
                list.add(sortedArray[right]);
                break;
            } else {
                if (curSum > s)
                    right--;
                else
                    left++;
            }
        }
        return list;
    }

    /**
     * 获取所有和为s的连续正数序列
     * @param s
     * @return
     */
    public static ArrayList<ArrayList<Integer>> findContinuousSequence(int s) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        if (s < 4) {
            return arrayList;
        }
        int small = 1;
        int big = 2;

        while (small < (s + 1) / 2) {
            int curSum = 0;
            for (int i = small; i <= big; i++) {
                curSum += i;
            }

            if (curSum == s) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = small; i <= big; i++) {
                    list.add(i);
                }
                arrayList.add(list);
                small++;
            } else if (curSum > s) {
                small++;
            } else {
                big++;
            }
        }
        return arrayList;
    }
}
