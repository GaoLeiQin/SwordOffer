package com.so;

import org.junit.Test;

/**
 * 第2题 单例设计模式
 * 设计一个类，只能生成该类的一个实例。
 *
 * @author qgl
 * @date 2019/06/22
 */
public class Test2 {
    @Test
    public void test2() {
        Singleton1 singleton = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println("使用单例模式获取对象，是否是同一个实例：" + singleton.equals(singleton2));
//        Singleton1 singleton3 = new Singleton1();
//        System.out.println("使用new创建对象，是否是同一个实例：" + singleton.equals(singleton3));
    }
}
