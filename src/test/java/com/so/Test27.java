package com.so;

import org.junit.Test;

/**
 * 第27题
 * 将二叉搜索树转换成一个排序的双向链表
 *
 * @author qgl
 * @date 2019/03/13
 */
public class Test27 {
    @Test
    public void test27() throws Exception {
        BinaryToLinked27.BinaryTreeNode root1 = new BinaryToLinked27.BinaryTreeNode();
        BinaryToLinked27.BinaryTreeNode node1 = new BinaryToLinked27.BinaryTreeNode();
        BinaryToLinked27.BinaryTreeNode node2 = new BinaryToLinked27.BinaryTreeNode();
        BinaryToLinked27.BinaryTreeNode node3 = new BinaryToLinked27.BinaryTreeNode();
        BinaryToLinked27.BinaryTreeNode node4 = new BinaryToLinked27.BinaryTreeNode();
        BinaryToLinked27.BinaryTreeNode node5 = new BinaryToLinked27.BinaryTreeNode();
        BinaryToLinked27.BinaryTreeNode node6 = new BinaryToLinked27.BinaryTreeNode();
        root1.leftNode = node1;
        root1.rightNode = node2;
        node1.leftNode = node3;
        node1.rightNode = node4;
        node4.leftNode = node5;
        node4.rightNode = node6;
        root1.data = 8;
        node1.data = 9;
        node2.data = 7;
        node3.data = 10;
        node4.data = 2;
        node5.data = 4;
        node6.data = 1;

        BinaryToLinked27.convert(root1);
    }
}
