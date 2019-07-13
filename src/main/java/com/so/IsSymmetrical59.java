package com.so;

import com.so.Common.TreeNode;

import java.util.Stack;

/**
 * 第59题
 * 判断二叉树是否是对称的
 * 
 * @author qgl
 * @date 2017/08/30
 */
public class IsSymmetrical59 {

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
        if (leftNode == null && rightNode == null) {
            return true;
        }
        if (leftNode == null || rightNode == null) {
            return false;
        }

        return leftNode.val == rightNode.val && isCommon(leftNode.left,rightNode.right) && isCommon(leftNode.right,rightNode.left);
    }

    /**
     * 解法二：迭代
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param root
     * @return
     */
    public static boolean isSymmetric2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode t1 = stack.pop();
            TreeNode t2 = stack.pop();
            if (t1 == null && t2 == null) {
                continue;
            }
            if (t1 == null || t2 == null) {
                return false;
            }
            if (t1.val != t2.val) {
                return false;
            }
            stack.push(t1.left);
            stack.push(t2.right);
            stack.push(t1.right);
            stack.push(t2.left);
        }
        return true;
    }
    
}
