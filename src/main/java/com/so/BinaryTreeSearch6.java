package com.so;

import java.util.Arrays;

import com.so.Common.TreeNode;

/**
 * 第6题
 * 输入二叉树的前序遍历和中序遍历结果,重建该二叉树。
 *
 * @author qgl
 * @date 2017/08/09
 */
public class BinaryTreeSearch6 {

    /**
     * 解法一：递归（传入数组的拷贝）
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param pre
     * @param in
     * @return
     */
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length == 0 || in.length == 0) {
            return null;
        }
        if (pre.length != in.length) {
            return null;
        }

        TreeNode root = new TreeNode(pre[0]);
        for (int i = 0; i < pre.length; i++) {
            if (pre[0] == in[i]) {
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
            }
        }
        return root;
    }

    /**
     * 解法二：递归：传入子数组的边界索引
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode reConstructBinaryTree2(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0 ||
                inorder == null || inorder.length == 0) return null;
        return helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }


    private TreeNode helper(int[] preorder, int preL, int preR, int[] inorder, int inL, int inR) {
        if (preL > preR || inL > inR) {
            return null;
        }
        int rootVal = preorder[preL];
        int index = 0;
        while (index <= inR && inorder[index] != rootVal) {
            index++;
        }
        TreeNode root = new TreeNode(rootVal);
        root.left = helper(preorder, preL + 1, preL - inL + index, inorder, inL, index);
        root.right = helper(preorder, preL - inL + index + 1, preR, inorder, index + 1, inR);
        return root;
    }

}
