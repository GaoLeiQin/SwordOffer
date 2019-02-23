package com.so;

/**
 * 第9题
 * 输入一个整数n，求斐波那契数列的第n项。
 *
 * @author qgl
 * @date 2017/08/09
 */
public class Fibonacci9 {

    /**
     * 解法一：定义三个局部变量，作为交换
     *
     * @param n
     * @return
     */
    public static int getFibonacci1(int n) {
        int result = 0;
        int preOne = 1;
        int preTwo = 0;
        if (n == 0) {
            return preTwo;
        }
        if (n == 1) {
            return preOne;
        }
        for (int i = 2; i <= n; i++) {
            result = preOne + preTwo;
            preTwo = preOne;
            preOne = result;
        }
        return result;
    }

    /**
     * 解法二 ：只需要两个局部变量
     *
     * @param n
     * @return
     */
    public static long getFibonacci2(int n) {
        long number = 1;
        long sum = 1;
        if (n <= 0)
            return 0;
        if (n == 1 || n == 2) {
            return 1;
        }

        while (n-- > 2) {
            sum += number;
            number = sum - number;
        }
        return sum;
    }

    /**
     * 解法三：递归：效率低，有大量重复计算
     *
     * @param n
     * @return
     */
    public static int getFibonacci3(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return getFibonacci3(n - 1) + getFibonacci3(n - 2);
    }
}
