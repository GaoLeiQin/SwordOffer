package com.so;

import java.util.*;

import com.so.Common.TreeNode;

/**
 * 第60题
 * 之字形打印二叉树
 *
 * @author qgl
 * @date 2017/08/30
 */
public class ZTreePrint60 {
    /**
     * 解法一：迭代
     *
     * @param root
     * @return
     */
    public static List<List<Integer>> Print(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            LinkedList<Integer> tmp = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (depth % 2 == 0) {
                    tmp.add(node.val);
                } else {
                    tmp.addFirst(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(tmp);
            depth++;
        }
        return res;
    }

    /**
     * 解法二：递归
     *
     * @param root
     * @return
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, root, 0);
        return res;

    }

    private void helper(List<List<Integer>> res, TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (res.size() == depth) {
            res.add(new LinkedList<>());
        }
        if (depth % 2 == 0) {
            res.get(depth).add(root.val);
        } else {
            res.get(depth).add(0, root.val);
        }
        helper(res, root.left, depth + 1);
        helper(res, root.right, depth + 1);
    }
}
