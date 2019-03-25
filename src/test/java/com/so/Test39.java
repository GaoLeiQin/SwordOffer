package com.so;

import org.junit.Test;

/**
 * 第39题
 * 输入根节点求树的深度
 *
 * @author qgl
 * @date 2019/03/25
 */
public class Test39 {
    @Test
    public void test39() throws Exception {
        TreePath39.BinaryTreeNode root1 = new TreePath39.BinaryTreeNode();
        TreePath39.BinaryTreeNode node1 = new TreePath39.BinaryTreeNode();
        TreePath39.BinaryTreeNode node2 = new TreePath39.BinaryTreeNode();
        TreePath39.BinaryTreeNode node3 = new TreePath39.BinaryTreeNode();
        TreePath39.BinaryTreeNode node4 = new TreePath39.BinaryTreeNode();
        TreePath39.BinaryTreeNode node5 = new TreePath39.BinaryTreeNode();
        TreePath39.BinaryTreeNode node6 = new TreePath39.BinaryTreeNode();
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

        /*
                   二叉树
                     8
                   /   \
                  9     7
                /   \
               10    2
                    / \
                   4   1
        */

        System.out.println("树的深度：" + TreePath39.treePath(root1));
        System.out.println("是否是平衡二叉树：" + TreePath39.isBalanced(root1));
    }
}
