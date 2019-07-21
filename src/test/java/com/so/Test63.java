package com.so;

import com.so.Common.TreeNode;
import org.junit.Test;

/**
 * 第63题
 * 给定一棵二叉搜索树，请找出其中的第k小的结点
 *
 * @author qgl
 * @date 2019/04/19
 */
public class Test63 {

    @Test
    public void test63() throws Exception {
        TreeNode root = new TreeNode(7);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = new TreeNode(8);
        TreeNode node6 = new TreeNode(11);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        KthNode63 kthNode63 = new KthNode63();
        int k = 3;
        System.out.println("解法一：递归查找：" + kthNode63.KthNode(root, k).val);
        System.out.println("解法二：非递归，借用栈查找：" + kthNode63.getKthNode2(root, k).val);
    }
}
