package com.so;

import java.util.LinkedList;
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
     * 二叉树
     */
    static class BinaryTreeNode {
        int data;
        BinaryTreeNode leftNode;
        BinaryTreeNode rightNode;
    }

    /**
     * 层序输出二叉树每个节点值
     * @param root
     */
    public static void printFromTopToBottom(BinaryTreeNode root) {
        if(root == null)
            return ;
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            System.out.print(node.data + " , ");
            if(node.leftNode != null)
                queue.add(node.leftNode);
            if(node.rightNode != null)
                queue.add(node.rightNode);
        }
    }
}


