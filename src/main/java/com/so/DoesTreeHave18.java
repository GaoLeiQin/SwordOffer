package com.so;

import com.so.Common.TreeNode;

/**
 * 第18题
 * 判断二叉树A中是否包含子树B
 *
 * @author qgl
 * @date 2017/08/10
 */
public class DoesTreeHave18 {
    /**
     * 判断是否包含子树
     *
     * @param source
     * @param target
     * @return
     */
    public static boolean hasSubTree(TreeNode source, TreeNode target) {
        if (target == null) {
            return true;
        }
        if (source == null) {
            return false;
        }

        if (doesTree1HaveTree2(source, target)) {
            return true;
        }
        return hasSubTree(source.left, target) || hasSubTree(source.right, target);
    }

    /**
     * 递归遍历两棵树
     *
     * @param source
     * @param target
     * @return
     */
    public static boolean doesTree1HaveTree2(TreeNode source, TreeNode target) {
        if (source == null && target == null) {
            return true;
        }
        if (source == null || target == null) {
            return false;
        }
        if (source.val != target.val) {
            return false;
        }

        return doesTree1HaveTree2(source.left, target.left) && doesTree1HaveTree2(source.right, target.right);
    }
}
