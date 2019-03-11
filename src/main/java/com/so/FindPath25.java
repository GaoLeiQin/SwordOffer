package com.so;

import java.util.*;

/**
 * 第25题
 * 输入一个二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径
 *
 * @author qgl
 * @date 2017/08/13
 */
public class FindPath25 {
    /**
     * 二叉树
     */
    static class BinaryTreeNode {
        int data;
        BinaryTreeNode leftNode;
        BinaryTreeNode rightNode;
    }

    /**
     * 利用栈寻找全路径
     * @param root
     * @param k
     */
    public static void findAllPath1(BinaryTreeNode root, int k) {
        if (root == null) {
            return;
        }
        Stack<Integer> stack = new Stack<Integer>();
        findPath(root, k, stack);
    }

    private static void findPath(BinaryTreeNode root, int k, Stack<Integer> path) {
        if (root == null) {
            return;
        }

        if (root.leftNode == null && root.rightNode == null) {
            if (root.data == k) {
                System.out.print("路径开始:");
                for (int a : path) {
                    System.out.print(a + ",");
                }
                //最后输出叶子节点
                System.out.println(root.data);
            }
        } else {
            path.push(root.data);
            findPath(root.leftNode, k - root.data, path);
            findPath(root.rightNode, k - root.data, path);
            path.pop();
        }
    }

    static ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
    static ArrayList<Integer> list = new ArrayList<>();

    /**
     * 利用list寻找全路径
     * @param root
     * @param target
     * @return
     */
    public static ArrayList<ArrayList<Integer>> findAllPath2(BinaryTreeNode root, int target) {
        if (root == null) {
            return resultList;
        }
        list.add(root.data);
        target -= root.data;

        if (target == 0 && root.leftNode == null && root.rightNode == null) {
            resultList.add(new ArrayList<>(list));
        } else {
            findAllPath2(root.leftNode, target);
            findAllPath2(root.rightNode, target);
        }
        //每次返回上一层要回退一个节点
        list.remove(list.size() - 1);
        return resultList;
    }

}

