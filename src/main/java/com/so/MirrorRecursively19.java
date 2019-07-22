package com.so;

import java.util.Stack;
import com.so.Common.TreeNode;

/**
 * 第19题
 * 输入一个二叉树，输出它的镜像
 *
 * @author qgl
 * @date 2017/08/10
 */
public class MirrorRecursively19 {

    /**
     * 解法一：递归
     * @param root
     */
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        Mirror(root.left);
        Mirror(root.right);
    }

    /**
     * 解法二：非递归，利用栈
     * @param root
     * @return
     */
    public void Mirror2(TreeNode root) {
        if (root == null) {
            return ;
        }
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                // 交换左右子节点
                TreeNode temp = root.left;
                root.left = root.right;
                root.right = temp;
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            root = root.right;
        }
    }
}
