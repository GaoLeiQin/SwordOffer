package com.so;

import org.junit.Test;

/**
 * 第34题
 * 求从小到大的第1500个丑数（只包含因子2,3,5的数为丑数，1是第一个丑数）
 *
 * @author qgl
 * @date 2019/03/20
 */
public class Test34 {
    @Test
    public void test34() throws Exception {
        int num = 100;
        System.out.println("第 " + num + " 个丑数是 " + UglyNumber34.getUglyNumber(num));
    }
}
