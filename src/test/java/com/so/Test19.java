package com.so;

import org.junit.Test;
import com.so.Common.TreeNode;

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
        TreeNode root = new TreeNode(8);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(9);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(1);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node4.left = node5;
        node4.right = node6;
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

        System.out.println("原二叉树的根节点的右子树 = " + root.right.val);
        MirrorRecursively19 mirror = new MirrorRecursively19();
        mirror.Mirror(root);
        System.out.println("解法一：递归，二叉树的镜像 根节点的右子树 = " + root.right.val);
    }
}
