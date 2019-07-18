package com.so;

import java.util.*;
import com.so.Common.TreeNode;

/**
 * 第61题
 * 把二叉树打印成多行，从上到下按层打印二叉树，同一层结点从左至右输出。
 *
 * @author qgl
 * @date 2017/08/30
 */
public class LevelPrintTree61 {
    /**
     * 从左至右打印每行二叉树
     * @param pRoot
     * @return
     */
    public static ArrayList<ArrayList<Integer>> printTreeNodeByLeftToRight(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        ArrayList<Integer> tmp = new ArrayList<>();
        int start = 0;
        int end = 1;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            tmp.add(node.val);
            start++;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }

            if (start == end) {
                start = 0;
                end = queue.size();
                res.add(new ArrayList<>(tmp));
                tmp.clear();
            }
        }
        return res;
    }
}
