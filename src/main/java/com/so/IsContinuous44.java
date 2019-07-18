package com.so;

import java.util.Arrays;

/**
 * 第44题
 * 判断扑克牌中的顺子，0表示大小王（可以是任意数）
 * 1表示A，2~10为本身，11表示J，12表示Q，13表示K
 *
 * @author qgl
 * @date 2017/08/16
 */
public class IsContinuous44 {

    /**
     * 判断是否是顺子
     * @param numbers
     * @return
     */
    public static boolean isContinuous(int [] numbers) {
        if (numbers == null || numbers.length == 0) {
            return false;
        }
        int count = 0;
        int diff = 0;
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 0) {
                count++;
                continue;
            }
            if (numbers[i] == numbers[i+1]) {
                return false;
            }

            diff += numbers[i+1] - numbers[i] - 1;
        }

        return diff <= count;
    }
}