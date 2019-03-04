package com.so;

/**
 * 第18题
 * 判断二叉树A中是否包含子树B
 *
 * @author qgl
 * @date 2017/08/10
 */
public class DoesTreeHave18 {
    /**
     * 链表
     */
    static class BinaryTreeNode {
        int data;
        BinaryTreeNode leftNode;
        BinaryTreeNode rightNode;
    }

    /**
     * 判断是否包含子树
     * @param root1
     * @param root2
     * @return
     */
    public static boolean hasSubTree(BinaryTreeNode root1, BinaryTreeNode root2) {
        boolean result = false;

        if (root1 != null && root2 != null) {
            if (root1.data == root2.data)
                result = doesTree1HaveTree2(root1, root2);
            if (!result)
                return hasSubTree(root1.leftNode, root2) || hasSubTree(root1.rightNode, root2);
        }

        return result;
    }

    /**
     * 递归遍历两棵树
     * @param root1
     * @param root2
     * @return
     */
    public static boolean doesTree1HaveTree2(BinaryTreeNode root1, BinaryTreeNode root2) {
        // 若Tree2已经遍历完了都能对应的上，返回true
        if (root2 == null) {
            return true;
        }

        //若Tree2还没有遍历完，Tree1却遍历完了。返回false
        if (root1 == null) {
            return false;
        }

        if (root1.data != root2.data) {
            return false;
        }

        return doesTree1HaveTree2(root1.leftNode, root2.leftNode) &&
                doesTree1HaveTree2(root1.rightNode, root2.rightNode);
    }
}
