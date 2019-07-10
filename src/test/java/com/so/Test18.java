package com.so;

import com.so.Common.TreeNode;
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
        TreeNode root1 = new TreeNode(3);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(0);
        TreeNode node6 = new TreeNode(0);
        root1.left = node1;
        root1.right = node2;
        node1.left = node3;
        node1.right = node4;
        node4.left = node5;
        node4.right = node6;

        TreeNode root2 = new TreeNode(4);
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        root2.left = a;
        root2.right = b;

        System.out.println("是否包含 " + DoesTreeHave18.hasSubTree(root1, root2));
    }
}
