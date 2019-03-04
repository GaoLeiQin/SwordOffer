package com.so;

import org.junit.Test;

/**
 * 第18题
 * 判断二叉树A中是否包含子树B
 *
 * @author qgl
 * @date 2019/03/04
 */
public class Test18 {
    @Test
    public void test18() throws Exception {
        DoesTreeHave18.BinaryTreeNode root1 = new DoesTreeHave18.BinaryTreeNode();
        DoesTreeHave18.BinaryTreeNode node1 = new DoesTreeHave18.BinaryTreeNode();
        DoesTreeHave18.BinaryTreeNode node2 = new DoesTreeHave18.BinaryTreeNode();
        DoesTreeHave18.BinaryTreeNode node3 = new DoesTreeHave18.BinaryTreeNode();
        DoesTreeHave18.BinaryTreeNode node4 = new DoesTreeHave18.BinaryTreeNode();
        DoesTreeHave18.BinaryTreeNode node5 = new DoesTreeHave18.BinaryTreeNode();
        DoesTreeHave18.BinaryTreeNode node6 = new DoesTreeHave18.BinaryTreeNode();
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
        DoesTreeHave18.BinaryTreeNode root2 = new DoesTreeHave18.BinaryTreeNode();
        DoesTreeHave18.BinaryTreeNode a = new DoesTreeHave18.BinaryTreeNode();
        DoesTreeHave18.BinaryTreeNode b = new DoesTreeHave18.BinaryTreeNode();
        root2.leftNode = a;
        root2.rightNode = b;
        root2.data = 8;
        a.data = 9;
        b.data = 2;

        System.out.println("是否包含 " + DoesTreeHave18.hasSubTree(root1, root2));
    }
}
