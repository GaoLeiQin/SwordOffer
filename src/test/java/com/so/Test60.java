package com.so;

import org.junit.Test;

/**
 * 第60题
 * 之字形打印二叉树
 *
 * @author qgl
 * @date 2019/04/16
 */
public class Test60 {

    @Test
    public void test60() throws Exception {
        ZTreePrint60.TreeNode root = new ZTreePrint60.TreeNode(7);
        ZTreePrint60.TreeNode node1 = new ZTreePrint60.TreeNode(5);
        ZTreePrint60.TreeNode node2 = new ZTreePrint60.TreeNode(8);
        ZTreePrint60.TreeNode node3 = new ZTreePrint60.TreeNode(3);
        ZTreePrint60.TreeNode node4 = new ZTreePrint60.TreeNode(6);
        ZTreePrint60.TreeNode node5 = new ZTreePrint60.TreeNode(9);
        ZTreePrint60.TreeNode node6 = new ZTreePrint60.TreeNode(11);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        System.out.println("之字形打印二叉树：" + ZTreePrint60.Print(root));
    }
}
