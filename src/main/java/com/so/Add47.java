package com.so;

/**
 * 第47题
 * 不用加减乘除做加法
 *
 * @author qgl
 * @date 2017/08/16
 */
public class Add47 {
    /**
     * 求和
     * @param num1
     * @param num2
     * @return
     */
    public static int add(int num1,int num2) {
        while (num2 != 0) {
            int temp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        return num1;
    }

}
