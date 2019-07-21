package com.so;

import com.so.Common.TreeNode;
import org.junit.Test;

/**
 * 第62题
 * 二叉树的序列化与反序列化
 *
 * @author qgl
 * @date 2019/04/18
 */
public class Test62 {

    @Test
    public void test62() throws Exception {
        TreeNode root = new TreeNode(7);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(8);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = new TreeNode(9);
        TreeNode node6 = new TreeNode(11);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        String serializerTree = Serializer62.serialize(root);
        System.out.println("序列化二叉树：" + serializerTree);
        System.out.println("反序列化二叉树后，从左至右输出：" + LevelPrintTree61.printTreeNodeByLeftToRight(Serializer62.deserialize(serializerTree)));
    }
}
