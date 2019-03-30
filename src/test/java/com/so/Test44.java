package com.so;

import org.junit.Test;

/**
 * 第44题
 * 判断扑克牌中的顺子，0表示大小王（可以是任意数）
 * 1表示A，2~10为本身，11表示J，12表示Q，13表示K
 *
 * @author qgl
 * @date 2019/03/30
 */
public class Test44 {
    @Test
    public void test44() throws Exception {
        int[] array = {2, 6, 4, 5, 0};
        System.out.println("是否是顺子:" + IsContinuous44.isContinuous(array));
    }
}
