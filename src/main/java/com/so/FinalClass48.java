package com.so;

/**
 * 第48题
 * 不能被继承的类
 *
 * @author qgl
 * @date 2017/08/16
 */
public class FinalClass48 {

    /**
     * 解法一：被final修饰的类不能被继承
     */
//    public final class FinalClass48 {

    /**
     * 解法二：私有构造器的类不能继承
     */
    private FinalClass48(){}

    public static FinalClass48 getInstance() {
        return new FinalClass48();
    }

    public static void deleteInstance(FinalClass48 instance) {
        instance=null;
    }


}