package com.so;

import java.util.Arrays;

/**
 * 第6题
 * 输入二叉树的前序遍历和中序遍历结果,重建该二叉树。
 *
 * @author qgl
 * @date 2017/08/09
 */
public class BinaryTreeSearch6 {

    /**
     * 二叉树节点
     */
    static class BinaryTreeNode {
        public int value;
        public BinaryTreeNode leftNode;
        public BinaryTreeNode rightNode;
    }

    /**
     * 重建二叉树
     * @param preOrder
     * @param inorder
     * @return
     */
    public static BinaryTreeNode reConstructBinaryTree(int[] preOrder, int[] inorder) {
        if (preOrder == null || inorder == null) {
            return null;
        }
        if (preOrder.length == 0 || inorder.length == 0) {
            return null;
        }
        if (preOrder.length != inorder.length) {
            System.err.println("两个数组的长度不一致！");
            return null;
        }

        BinaryTreeNode root = new BinaryTreeNode();
        root.value = preOrder[0];

        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preOrder[0]) {
                root.leftNode = reConstructBinaryTree(Arrays.copyOfRange(preOrder, 1, i + 1)
                        , Arrays.copyOfRange(inorder, 0, i));
                root.rightNode = reConstructBinaryTree(Arrays.copyOfRange(preOrder, i + 1, preOrder.length)
                        , Arrays.copyOfRange(inorder, i + 1, inorder.length));
            }
        }

        return root;
    }

    /**
     * 打印二叉树
     *
     * @param root
     */
    public static void printBinaryTreeNode(BinaryTreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root != null) {
            printBinaryTreeNode(root.leftNode);
            printBinaryTreeNode(root.rightNode);
            sb.append(root.value).append(",");
        }
        System.out.print(sb);
    }
}
