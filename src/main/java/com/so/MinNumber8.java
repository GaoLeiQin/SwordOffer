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
     * 获取旋转数组中的最小值
     * @param array
     * @return
     */
    public static Integer minInReversingList(int[] array) {
        if (array == null)
            return null;

        int leftIndex = 0;
        int rightIndex = array.length - 1;
        int mid = 1;

        while (array[leftIndex] >= array[rightIndex]) {
            //如果数组只有一个或两个元素
            if(rightIndex - leftIndex <= 1) {
                mid = rightIndex;
                break;
            }

            mid = (leftIndex + rightIndex) / 2;

            if (array[leftIndex] == array[rightIndex] && array[leftIndex] == array[mid]) {
                if(array[leftIndex+1] != array[rightIndex-1]) {
                    mid = array[leftIndex+1] < array[rightIndex-1] ? leftIndex+1 : rightIndex-1;
                    break;
                } else {
                    leftIndex++;
                    rightIndex--;
                }
            } else {
                if(array[mid] >= array[leftIndex])
                    leftIndex = mid;
                else {
                    if(array[mid] <= array[rightIndex])
                        rightIndex = mid;
                }
            }
        }

        return array[mid];
    }
}
