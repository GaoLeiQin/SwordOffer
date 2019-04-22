package com.so;

import org.junit.Test;

/**
 * 第66题
 * 判断在一个矩阵中是否存在一条包含某字符串所有字符的路径
 *
 * @author qgl
 * @date 2019/04/22
 */
public class Test66 {

    @Test
    public void test66() throws Exception {
        char[] arr = {'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e'};
        int rows = 3;
        int columns = 4;
        char[] str = {'b', 'c', 'c', 'e', 'd'};
        char[] str2 = {'a', 'b', 'c', 'b'};
        System.out.println("矩阵中是否存在该路径:" + HasPath66.hasPath(arr, rows, columns, str));
    }
}
