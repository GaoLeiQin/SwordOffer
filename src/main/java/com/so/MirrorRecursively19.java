package com.so;

import java.util.Stack;

/**
 * 第19题
 * 输入一个二叉树，输出它的镜像
 *
 * @author qgl
 * @date 2017/08/10
 */
public class MirrorRecursively19 {
    static class BinaryTreeNode {
        int data;
        BinaryTreeNode leftNode;
        BinaryTreeNode rightNode;
    }

    /**
     * 解法一：非递归，利用栈
     * @param root
     * @return
     */
    public static BinaryTreeNode mirrorRecursively1(BinaryTreeNode root) {
        if (root == null) {
            return null;
        }
        BinaryTreeNode node = root;
        Stack<BinaryTreeNode> stack = new Stack<>();

        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                // 交换左右子节点
                BinaryTreeNode temp = node.leftNode;
                node.leftNode = node.rightNode;
                node.rightNode = temp;
                stack.push(node);
                node = node.leftNode;
            }

            if (!stack.isEmpty()) {
                node = stack.pop();
                node = node.rightNode;
            }
        }
        return root;
    }

    /**
     * 解法二：递归
     * @param root
     */
    public static void mirrorRecursively2(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        BinaryTreeNode tmp = root.rightNode;
        root.rightNode = root.leftNode;
        root.leftNode = tmp;

        mirrorRecursively2(root.leftNode);
        mirrorRecursively2(root.rightNode);
    }
}
