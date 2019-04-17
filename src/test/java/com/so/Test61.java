package com.so;

import org.junit.Test;

/**
 * 第61题
 * 把二叉树打印成多行，从上到下按层打印二叉树，同一层结点从左至右输出。
 *
 * @author qgl
 * @date 2019/04/17
 */
public class Test61 {

    @Test
    public void test61() throws Exception {
        LevelPrintTree61.TreeNode root = new LevelPrintTree61.TreeNode(7);
        LevelPrintTree61.TreeNode node1 = new LevelPrintTree61.TreeNode(5);
        LevelPrintTree61.TreeNode node2 = new LevelPrintTree61.TreeNode(8);
        LevelPrintTree61.TreeNode node3 = new LevelPrintTree61.TreeNode(3);
        LevelPrintTree61.TreeNode node4 = new LevelPrintTree61.TreeNode(6);
        LevelPrintTree61.TreeNode node5 = new LevelPrintTree61.TreeNode(9);
        LevelPrintTree61.TreeNode node6 = new LevelPrintTree61.TreeNode(11);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        System.out.println("从左至右打印每行二叉树：" + LevelPrintTree61.printTreeNodeByLeftToRight(root));
    }
}
