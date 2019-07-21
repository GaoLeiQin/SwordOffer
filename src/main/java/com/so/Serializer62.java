package com.so;

import com.so.Common.TreeNode;

/**
 * 第62题
 * 二叉树的序列化与反序列化
 *
 * @author qgl
 * @date 2017/08/30
 */
public class Serializer62 {

    /**
     * 序列化二叉树 (前序遍历)
     *
     * @param root
     * @return
     */
    public static String serialize(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        if (root == null) {
            sb.append("#,");
            return sb.toString();
        }

        sb.append(root.val + ",");
        sb.append(serialize(root.left));
        sb.append(serialize(root.right));
        return sb.toString();
    }

    private static int index = -1;

    /**
     * 反序列化二叉树
     *
     * @param str
     * @return
     */
    public static TreeNode deserialize(String str) {
        index++;
        int len = str.length();
        String[] strArray = str.split(",");
        TreeNode node = null;

        if (index >= len) {
            return null;
        }

        if (!strArray[index].equals("#")) {
            node = new TreeNode(Integer.valueOf(strArray[index]));
            node.left = deserialize(str);
            node.right = deserialize(str);
        }
        return node;
    }
}
