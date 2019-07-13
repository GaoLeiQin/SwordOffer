package com.so;

import org.junit.Test;
import com.so.Common.TreeNode;

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
        TreeNode root = new TreeNode(8);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(9);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(9);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        System.out.println("二叉树是否对称：" + IsSymmetrical59.isSymmetrical(root));
    }
}
