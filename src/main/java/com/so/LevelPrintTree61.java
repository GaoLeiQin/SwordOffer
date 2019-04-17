package com.so;

import java.util.*;

/**
 * 第61题
 * 把二叉树打印成多行，从上到下按层打印二叉树，同一层结点从左至右输出。
 *
 * @author qgl
 * @date 2017/08/30
 */
public class LevelPrintTree61 {

    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    /**
     * 从左至右打印每行二叉树
     * @param pRoot
     * @return
     */
    public static ArrayList<ArrayList<Integer>> printTreeNodeByLeftToRight(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null)
            return res;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = 1;

        while (!queue.isEmpty()) {
            TreeNode node = queue.pop();
            list.add(node.val);
            start++;
            if (node.left != null)
                queue.offer(node.left);
            if (node.right != null)
                queue.offer(node.right);

            if (start == end) {
                start = 0;
                end = queue.size();
                res.add(new ArrayList<>(list));
                list.clear();
            }
        }
        return res;
    }
}
