package com.so;

import org.junit.Test;

/**
 * 第23题
 * 层序遍历二叉树
 *
 * @author qgl
 * @date 2019/03/09
 */
public class Test23 {
    @Test
    public void test23() throws Exception {
        PrintFromTopToBottom23.BinaryTreeNode root1 = new PrintFromTopToBottom23.BinaryTreeNode();
        PrintFromTopToBottom23.BinaryTreeNode node1 = new PrintFromTopToBottom23.BinaryTreeNode();
        PrintFromTopToBottom23.BinaryTreeNode node2 = new PrintFromTopToBottom23.BinaryTreeNode();
        PrintFromTopToBottom23.BinaryTreeNode node3 = new PrintFromTopToBottom23.BinaryTreeNode();
        PrintFromTopToBottom23.BinaryTreeNode node4 = new PrintFromTopToBottom23.BinaryTreeNode();
        PrintFromTopToBottom23.BinaryTreeNode node5 = new PrintFromTopToBottom23.BinaryTreeNode();
        PrintFromTopToBottom23.BinaryTreeNode node6 = new PrintFromTopToBottom23.BinaryTreeNode();
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
                原二叉树
                     8
                   /   \
                  9     7
                /   \
               10    2
                    / \
                   4   1
        */

        System.out.print("层序输出的二叉树：");
        PrintFromTopToBottom23.printFromTopToBottom(root1);
    }
}
