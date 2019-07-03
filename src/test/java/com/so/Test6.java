package com.so;

import org.junit.Test;
import com.so.Common.TreeNode;

/**
 * 第6题
 * 输入二叉树的前序遍历和中序遍历结果,重建该二叉树.
 *
 * @author qgl
 * @date 2019/02/20
 */
public class Test6 {
    @Test
    public void test6() {
        // 前序遍历结果
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        // 中序遍历结果
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root = BinaryTreeSearch6.reConstructBinaryTree(pre, in);
        System.out.print("重建后的二叉树（层序输出）：" + new PrintFromTopToBottom23().PrintFromTopToBottom(root));
    }
}
