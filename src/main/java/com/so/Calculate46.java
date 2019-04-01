package com.so;

import java.lang.reflect.Method;
import java.util.ArrayList;

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
    public static int sum3(int n) {
        int sum = n;
        boolean result = (n > 0) && ((sum += sum3(n-1)) > 0);
        return sum;
    }

    /**
     * 解法二：利用递归和全局变量求和
     */
    public static int sum2 = 0;
    public static boolean sum2(int n) {
        sum2 += n;
        return (n > 0) && sum2(n - 1);
    }

}
