package com.so;

import java.util.ArrayList;
import java.util.LinkedList;
import com.so.Common.TreeNode;
import java.util.Queue;

/**
 * 第23题
 * 层序遍历二叉树
 *
 * @author qgl
 * @date 2017/08/11
 */
public class PrintFromTopToBottom23 {
    /**
     * 解法一：迭代
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param root
     * @return
     */
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return list;
    }

    /**
     * 解法二：递归
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param root
     * @return
     */
    public ArrayList<Integer> PrintFromTopToBottom2(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }

        list.add(root.val);
        levelOrder(root, list);
        return list;
    }

    public void levelOrder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            list.add(root.left.val);
        }
        if (root.right != null) {
            list.add(root.right.val);
        }
        levelOrder(root.left, list);
        levelOrder(root.right, list);
    }
}


