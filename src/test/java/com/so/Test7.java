package com.so;

import org.junit.Test;

/**
 * 第7题
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 * @author qgl
 * @date 2019/02/21
 */
public class Test7 {
    @Test
    public void test7() throws Exception {
        DoubleSQueue7 doubleSQueue7 = new DoubleSQueue7();
        doubleSQueue7.push(2);
        doubleSQueue7.push(5);
        doubleSQueue7.push(8);
        System.out.println("出队列：" + doubleSQueue7.pop());
    }
}
