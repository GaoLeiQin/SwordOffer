package com.so;

import org.junit.Test;

/**
 * 第25题
 * 输入一个二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径
 *
 * @author qgl
 * @date 2019/03/11
 */
public class Test25 {
    @Test
    public void test25() throws Exception {
        FindPath25.BinaryTreeNode root1 = new FindPath25.BinaryTreeNode();
        FindPath25.BinaryTreeNode node1 = new FindPath25.BinaryTreeNode();
        FindPath25.BinaryTreeNode node2 = new FindPath25.BinaryTreeNode();
        FindPath25.BinaryTreeNode node3 = new FindPath25.BinaryTreeNode();
        FindPath25.BinaryTreeNode node4 = new FindPath25.BinaryTreeNode();
        FindPath25.BinaryTreeNode node5 = new FindPath25.BinaryTreeNode();
        FindPath25.BinaryTreeNode node6 = new FindPath25.BinaryTreeNode();
        root1.leftNode = node1;
        root1.rightNode = node2;
        node1.leftNode = node3;
        node1.rightNode = node4;
        node4.leftNode = node5;
        node4.rightNode = node6;
        root1.data = 8;
        node1.data = 8;
        node2.data = 7;
        node3.data = 9;
        node4.data = 2;
        node5.data = 4;
        node6.data = 7;

        System.out.println("解法一：");
        FindPath25.findAllPath1(root1, 25);
        System.out.println("解法二，所有路径：" + FindPath25.findAllPath2(root1, 25));
    }
}
