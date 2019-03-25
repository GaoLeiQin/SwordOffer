package com.so;

/**
 * 第39题
 * 输入根节点求树的深度
 *
 * @author qgl
 * @date 2017/08/15
 */
public class TreePath39 {
    static class BinaryTreeNode {
        int data;
        BinaryTreeNode leftNode;
        BinaryTreeNode rightNode;
    }

    /**
     * 获取树的深度
     *
     * @param root
     * @return
     */
    public static int treePath(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = treePath(root.leftNode);
        int right = treePath(root.rightNode);
        return left > right ? (left + 1) : (right + 1);
    }

    /**
     * 判断输入的二叉树是不是平衡二叉树
     * （如果二叉树任意节点的左右子树深度相差不超过1，就是平衡的）
     *
     * @param root
     * @return
     */
    public static boolean isBalanced(BinaryTreeNode root) {
        if (root == null) {
            return true;
        }
        int left = treePath(root.leftNode);
        int right = treePath(root.rightNode);
        return Math.abs(left - right) <= 1;
    }
}
