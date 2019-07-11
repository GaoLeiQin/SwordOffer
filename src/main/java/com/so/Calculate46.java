package com.so;

/**
 * 第46题
 * 求1+2+...+n，不能使用乘除法，循环等
 *
 * @author qgl
 * @date 2017/08/16
 */
public class Calculate46 {

    /**
     * 解法一，利用递归求和
     * @param n
     * @return
     */
    public static int sum(int n) {
        int sum = n;
        boolean result = (n > 0) && ((sum += sum(n-1)) > 0);
        return sum;
    }

    /**
     * 解法二：利用递归和全局变量求和
     */
    private static int sum2 = 0;
    public static int sum2(int n) {
        sum3(n);
        return sum2;
    }

    private static boolean sum3(int n) {
        sum2 += n;
        return (n > 0) && sum3(n - 1);
    }

}
