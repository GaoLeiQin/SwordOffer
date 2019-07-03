package com.so;

import org.junit.Test;
import com.so.Common.TreeNode;

/**
 * 第23题
 * 层序遍历二叉树
 *
 * @author qgl
 * @date 2019/03/09
 */
public class Test23 {
    @Test
    public void test23() throws Exception {
        TreeNode root = new TreeNode(8);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(10);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(1);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node4.left = node5;
        node4.right = node6;

        /*
                原二叉树
                     8
                   /   \
                  9     7
                /   \
               10    2
                    / \
                   4   1
        */

        PrintFromTopToBottom23 printFromTopToBottom23 = new PrintFromTopToBottom23();
        System.out.print("层序输出的二叉树：" + printFromTopToBottom23.PrintFromTopToBottom(root));
    }
}
