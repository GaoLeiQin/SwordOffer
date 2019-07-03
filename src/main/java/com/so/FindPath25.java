package com.so;

import java.util.*;

import com.so.Common.TreeNode;

/**
 * 第25题
 * 输入一个二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径
 *
 * @author qgl
 * @date 2017/08/13
 */
public class FindPath25 {
    private ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();

    /**
     * 利用list寻找全路径
     *
     * @param root
     * @param target
     * @return
     */
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return listAll;
        }
        list.add(root.val);
        target -= root.val;

        if (target == 0 && root.left == null && root.right == null) {
            listAll.add(new ArrayList<>(list));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        // 回退
        list.remove(list.size() - 1);
        return listAll;
    }
}

