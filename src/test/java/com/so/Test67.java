package com.so;

import org.junit.Test;

/**
 * 第67题
 * 机器人的运动范围，一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。求机器人能够达到多少个格子
 *
 * @author qgl
 * @date 2019/04/23
 */
public class Test67 {

    @Test
    public void test67() throws Exception {
        int rows = 3;
        int columns = 4;
        int k = 18;
        System.out.println("机器人能够达到多少个格子:" + MovingCount67.movingCount(rows, columns, k));
    }
}
