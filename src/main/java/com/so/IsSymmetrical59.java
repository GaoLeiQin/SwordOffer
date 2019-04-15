package com.so;

/**
 * 第59题
 * 判断二叉树是否是对称的
 * 
 * @author qgl
 * @date 2017/08/30
 */
public class IsSymmetrical59 {
    /**
     * 二叉树
     */
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    /**
     * 判断二叉树是不是对称的
     * @param pRoot
     * @return
     */
    public static boolean isSymmetrical(TreeNode pRoot){
        return pRoot == null || isCommon(pRoot.left, pRoot.right);
    }

    /**
     * 判断左右子树是否相等
     * @param leftNode
     * @param rightNode
     * @return
     */
    public static boolean isCommon(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null)
            return true;

        if (leftNode != null && rightNode != null)
            return leftNode.val == rightNode.val &&
                    isCommon(leftNode.left,rightNode.right) &&
                    isCommon(leftNode.right,rightNode.left);
        return false;
    }
}
