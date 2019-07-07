package com.so;

import org.junit.Test;
import com.so.Common.TreeNode;

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
        TreeNode root = new TreeNode(8);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(10);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(1);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node4.left = node5;
        node4.right = node6;

        FindPath25 findPath25 = new FindPath25();
        System.out.println("所有路径：" + findPath25.FindPath(root, 20));
    }
}
