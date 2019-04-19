package com.so;

import com.so.LevelPrintTree61.TreeNode;

import java.util.Stack;

/**
 * 第63题
 * 给定一棵二叉搜索树，请找出其中的第k小的结点
 *
 * @author qgl
 * @date 2017/08/30
 */
public class KthNode63 {

    private static int count = 0;

    /**
     * 查找第k小的结点
     *
     * @param pRoot
     * @param k
     * @return
     */
    public static TreeNode getKthNode1(TreeNode pRoot, int k) {
        if (pRoot == null || k == 0) {
            return null;
        }
        count = k;
        return KthNode(pRoot);
    }

    /**
     * 解法一：递归查找
     *
     * @param root
     * @return
     */
    public static TreeNode KthNode(TreeNode root) {
        TreeNode t = null;
        if (root.left != null) {
            t = KthNode(root.left);
        }
        if (t == null && count == 1) {
            t = root;
        } else {
            count--;
        }
        if (t == null && root.right != null) {
            t = KthNode(root.right);
        }
        return t;
    }

    /**
     * 解法二：非递归，借用栈查找
     *
     * @param pRoot
     * @param k
     * @return
     */
    public static TreeNode getKthNode2(TreeNode pRoot, int k) {
        if (pRoot == null || k < 1) {
            return null;
        }
        int index = 0;
        TreeNode root = pRoot;
        Stack<TreeNode> s = new Stack<>();
        while (root != null || !s.isEmpty()) {
            while (root != null) {
                s.push(root);
                root = root.left;
            }

            if (!s.isEmpty()) {
                root = s.pop();
                index++;
                if (index == k) {
                    return root;
                }
                root = root.right;
            }
        }
        return null;
    }
}
