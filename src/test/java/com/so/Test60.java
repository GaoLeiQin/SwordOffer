package com.so;

import org.junit.Test;
import com.so.Common.TreeNode;

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
        TreeNode root = new TreeNode(7);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(8);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = new TreeNode(9);
        TreeNode node6 = new TreeNode(11);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        System.out.println("之字形打印二叉树：" + ZTreePrint60.Print(root));
    }
}
