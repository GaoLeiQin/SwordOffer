package com.so;

import java.util.HashSet;

/**
 * 第51题
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内，找出数组中任意一个重复的数字
 *
 * @author qgl
 * @date 2017/08/29
 */
public class Duplicate51 {
    /**
     * 解法一：利用题中数组的特点（数组中的元素小于数组长度）
     * 时间复杂度是O(n)，空间复杂度是O(1)
     *
     * @param numbers
     * @return
     */
    public static Integer duplicate1(int numbers[]) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }
        if (numbers.length == 1) {
            return numbers[0];
        }

        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            int index = numbers[i];
            if (index >= length) {
                index -= length;
            }
            if (numbers[index] >= length) {
                return index;
            }
            numbers[index] += length;
        }
        return null;
    }

    /**
     * 解法二：利用辅助空间 HashSet
     * 时间复杂度是O(n)，空间复杂度是O(n)
     *
     * @param numbers
     * @return
     */
    public static Integer duplicate2(int numbers[]) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }
        if (numbers.length == 1) {
            return numbers[0];
        }

        int length = numbers.length;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < length; i++) {
            if (!hashSet.add(numbers[i])) {
                return numbers[i];
            }
        }
        return null;
    }

    /**
     * 解法三：快慢指针
     *
     * @param numbers
     * @return
     */
    public static int duplicate3(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
        int slow = 0;
        int fast = 0;
        for (int i = 0; i < numbers.length; i++) {
            slow = numbers[slow];
            fast = numbers[numbers[fast]];
            if (fast == slow) {
                fast = 0;
                while (fast != slow) {
                    fast = numbers[fast];
                    slow = numbers[slow];
                }
                return slow;
            }
        }
        return -1;
    }

}
