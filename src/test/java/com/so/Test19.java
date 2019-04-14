package com.so;

import org.junit.Test;

/**
 * 第19题
 * 输入一个二叉树，输出它的镜像
 *
 * @author qgl
 * @date 2019/03/05
 */
public class Test19 {
    @Test
    public void test19() throws Exception {
        MirrorRecursively19.BinaryTreeNode root1 = new MirrorRecursively19.BinaryTreeNode();
        MirrorRecursively19.BinaryTreeNode node1 = new MirrorRecursively19.BinaryTreeNode();
        MirrorRecursively19.BinaryTreeNode node2 = new MirrorRecursively19.BinaryTreeNode();
        MirrorRecursively19.BinaryTreeNode node3 = new MirrorRecursively19.BinaryTreeNode();
        MirrorRecursively19.BinaryTreeNode node4 = new MirrorRecursively19.BinaryTreeNode();
        MirrorRecursively19.BinaryTreeNode node5 = new MirrorRecursively19.BinaryTreeNode();
        MirrorRecursively19.BinaryTreeNode node6 = new MirrorRecursively19.BinaryTreeNode();
        root1.leftNode = node1;
        root1.rightNode = node2;
        node1.leftNode = node3;
        node1.rightNode = node4;
        node4.leftNode = node5;
        node4.rightNode = node6;
        root1.data = 8;
        node1.data = 5;
        node2.data = 7;
        node3.data = 9;
        node4.data = 2;
        node5.data = 4;
        node6.data = 1;
/*
              原二叉树          二叉树的镜像
                 8                   8
               /   \               /   \
              5     7             7     5
            /   \                     /   \
           9     2                   2     9
                / \                 / \
               4   1               1   4
*/


        System.out.println("原二叉树 根节点的右子树的左节点的左节点 = null");

        MirrorRecursively19.mirrorRecursively1(root1);
        System.out.println("解法一：非递归，二叉树的镜像 根节点的右子树的左节点的左节点 = " + root1.rightNode.leftNode.leftNode.data);
//        MirrorRecursively19.mirrorRecursively2(root1);
//        System.out.println("解法二：递归，二叉树的镜像 根节点的右子树的左节点的左节点 = " + root1.rightNode.leftNode.leftNode.data);
    }
}
