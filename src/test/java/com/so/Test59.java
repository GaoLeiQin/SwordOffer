package com.so;

import org.junit.Test;

/**
 * 第59题
 * 判断二叉树是否是对称的
 *
 * @author qgl
 * @date 2019/04/15
 */
public class Test59 {

    @Test
    public void test59() throws Exception {
        IsSymmetrical59.TreeNode root = new IsSymmetrical59.TreeNode(8);
        IsSymmetrical59.TreeNode node1 = new IsSymmetrical59.TreeNode(5);
        IsSymmetrical59.TreeNode node2 = new IsSymmetrical59.TreeNode(5);
        IsSymmetrical59.TreeNode node3 = new IsSymmetrical59.TreeNode(9);
        IsSymmetrical59.TreeNode node4 = new IsSymmetrical59.TreeNode(2);
        IsSymmetrical59.TreeNode node5 = new IsSymmetrical59.TreeNode(2);
        IsSymmetrical59.TreeNode node6 = new IsSymmetrical59.TreeNode(9);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        System.out.println("二叉树是否对称：" + IsSymmetrical59.isSymmetrical(root));
    }
}
