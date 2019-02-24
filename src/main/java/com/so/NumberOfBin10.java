package com.so;

/**
 * 第10题
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 * @author qgl
 * @date 2017/08/09
 */
public class NumberOfBin10 {

    /**
     * 思路：把一个整数减去１再和原整数与，就会把整数最右边一个１变成０
     *
     * @param n
     * @return
     */
    public static int numberOfBin(int n) {
        int count = 0;

        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }
}
