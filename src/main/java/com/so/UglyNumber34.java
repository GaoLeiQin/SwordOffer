package com.so;

/**
 * 第34题
 * 求从小到大的第1500个丑数（只包含因子2,3,5的数为丑数，1是第一个丑数）
 *
 * @author qgl
 * @date 2017/08/15
 */
public class UglyNumber34 {

    /**
     * 获取第n个丑数
     *
     * @param n
     * @return
     */
    public static int getUglyNumber(int n) {
        if (n <= 0) {
            return 0;
        }
        int[] arr = new int[n];
        arr[0] = 1;
        int multiply2 = 0;
        int multiply3 = 0;
        int multiply5 = 0;

        for (int i = 1; i < n; i++) {
            int min = Math.min(arr[multiply2] * 2, Math.min(arr[multiply3] * 3, arr[multiply5] * 5));
            arr[i] = min;
            if (arr[multiply2] * 2 == min) {
                multiply2++;
            }
            if (arr[multiply3] * 3 == min) {
                multiply3++;
            }
            if (arr[multiply5] * 5 == min) {
                multiply5++;
            }
        }
        return arr[n - 1];
    }

}
