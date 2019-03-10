package com.so;

import java.util.Arrays;

/**
 * 第24题
 * 输入一个数组，判断数组是不是二叉搜索树的后序遍历结果
 *
 * @author qgl
 * @date 2017/08/11
 */
public class VerifySequerceOfBST24 {

    /**
     * 判断输入的数组是否是二叉搜索树的后序遍历结果
     * @param array
     * @return
     */
    public static boolean verifySequenceOfBST(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        int root = array[array.length - 1];
        int rightIndex = -1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > root) {
                rightIndex = i + 1;
                break;
            }
        }

        if (rightIndex == -1) {
            verifySequenceOfBST(Arrays.copyOfRange(array, 0, array.length - 1));
        } else {
            for (int i = rightIndex; i < array.length - 1; i++) {
                if (array[i] <= root) {
                    return false;
                }
            }
            verifySequenceOfBST(Arrays.copyOfRange(array, 0, rightIndex));
            verifySequenceOfBST(Arrays.copyOfRange(array, rightIndex, array.length));
        }
        return true;
    }

}