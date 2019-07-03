package com.so;

import java.util.Arrays;

/**
 * 第24题
 * 输入一个数组，判断数组是不是二叉搜索树的后序遍历结果
 *
 * @author qgl
 * @date 2017/08/11
 */
public class VerifySequenceOfBST24 {

    /**
     * 判断输入的数组是否是二叉搜索树的后序遍历结果
     * @param sequence
     * @return
     */
    public static boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }

        int rstart = 0;
        int rootIndex = sequence.length - 1;
        for (int i = 0; i < rootIndex; i++) {
            if (sequence[i] < sequence[rootIndex])
                rstart++;
        }

        if (rstart == 0) {
            VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,rootIndex));
            return true;
        }

        for (int i = rstart; i < rootIndex; i++) {
            if (sequence[i] <= sequence[rootIndex]) {
                return false;
            }
        }
        VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,rstart));
        VerifySquenceOfBST(Arrays.copyOfRange(sequence,rstart,rootIndex));
        return true;
    }

}