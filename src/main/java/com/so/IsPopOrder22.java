package com.so;

import java.util.Stack;
import java.util.Vector;

/**
 * 第22题
 * 输入两个整数序列，第一个序列表示压入顺序，判断第二个序列是否为弹出顺序
 *
 * @author qgl
 * @date 2017/08/10
 */
public class IsPopOrder22 {

    /**
     * 利用栈判断一个序列是否是另一个序列的弹出顺序
     * @param pushList 压入顺序序列
     * @param popList 弹出顺序序列
     * @return 判断结果
     */
    public static boolean isPopOrder(int[] pushList, int[] popList) {
        if (pushList == null || popList == null) {
            return false;
        }

        int point = 0;
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < pushList.length; i++) {
            stack.push(pushList[i]);
            while (!stack.isEmpty() && stack.peek() == popList[point]) {
                stack.pop();
                point++;
            }
        }
        return stack.isEmpty();
    }
}
