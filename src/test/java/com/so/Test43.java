package com.so;

import org.junit.Test;

/**
 * 第43题
 * 把n个骰子扔在地上，所有骰子朝上一面的点数之和为s,输入n,打印出s的所有可能出现的概率
 *
 * @author qgl
 * @date 2019/03/29
 */
public class Test43 {
    @Test
    public void test43() throws Exception {
        int diceNum = 2;
        System.out.println("所有可能出现的概率:" + DicesProbability43.printProbability(diceNum));
    }
}
