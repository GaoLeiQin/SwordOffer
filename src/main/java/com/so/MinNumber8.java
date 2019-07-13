package com.so;

/**
 * 第8题
 * 输入一个非递减排序数组的一个旋转，输出旋转数组的最小元素。
 *
 * @author qgl
 * @date 2017/08/09
 */
public class MinNumber8 {

    /**
     * 解法一：二分查找（寻找变化点）
     * 时间复杂度：O(log n)，空间复杂度：O(1)
     *
     * @param array
     * @return
     */
    public static int minInReversingList(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        if (array.length == 1 || array[array.length - 1] > array[0]) {
            return array[0];
        }

        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] > array[mid + 1]) {
                return array[mid + 1];
            }
            if (array[mid - 1] > array[mid]) {
                return array[mid];
            }

            if (array[mid] > array[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    /**
     * 解法二：二分查找（最左下标）
     * 时间复杂度：O(log n)，空间复杂度：O(1)
     *
     * @param nums
     * @return
     */
    public int minInReversingList2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }

    /**
     * 第8.1题：若非递减排序数组中有重复元素，求最小元素
     * 时间复杂度：O(log n)，空间复杂度：O(1)
     *
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                right--;
            }
        }
        return nums[left];
    }
}
