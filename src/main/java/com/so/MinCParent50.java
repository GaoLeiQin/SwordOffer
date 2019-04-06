package com.so;

import java.util.Stack;

/**
 * 第50题
 * 寻找树的两个节点的最低公共祖先
 *
 * @author qgl
 * @date 2017/09/02
 */
public class MinCParent50 {

    static class BinaryTreeNode {
        public int value;
        public BinaryTreeNode leftNode;
        public BinaryTreeNode rightNode;
        public BinaryTreeNode parentNode;

        public BinaryTreeNode(int value) {
            this.value = value;
        }
    }

    /**
     * 若树是二叉搜素树，递归调用二叉树
     * 时间复杂度是O(log n)，空间复杂度是O(1)
     *
     * @param rootParent
     * @param root
     * @param node1
     * @param node2
     * @return
     */
    public static BinaryTreeNode getLowestCommonAncestor1(BinaryTreeNode rootParent, BinaryTreeNode root, BinaryTreeNode node1, BinaryTreeNode node2) {
        if (root == null || node1 == null || node2 == null) {
            return null;
        }
        if ((root.value - node1.value) * (root.value - node2.value) < 0) {
            return root;
        } else if ((root.value - node1.value) * (root.value - node2.value) > 0) {
            BinaryTreeNode newRoot = ((root.value > node1.value) && (root.value > node2.value))
                    ? root.leftNode : root.rightNode;
            return getLowestCommonAncestor1(root, newRoot, node1, node2);
        } else {
            return rootParent;
        }
    }

    /**
     * 若树是普通树，并没有指向父节点的指针，获取node节点的路径时间复杂度为O(n)
     * 时间复杂度是O(n),空间复杂度是O(log n)
     *
     * @param root
     * @param node1
     * @param node2
     * @return
     */
    public static BinaryTreeNode getLowestCommonAncestor2(BinaryTreeNode root, BinaryTreeNode node1, BinaryTreeNode node2) {
        if (root == null || node1 == null || node2 == null) {
            return null;
        }
        Stack<BinaryTreeNode> path1 = new Stack<BinaryTreeNode>();
        boolean flag1 = getThePathOfTheNode(root, node1, path1);
        if (!flag1) {//树上没有node1节点
            return null;
        }
        Stack<BinaryTreeNode> path2 = new Stack<BinaryTreeNode>();
        boolean flag2 = getThePathOfTheNode(root, node2, path2);
        if (!flag2) {//树上没有node2节点
            return null;
        }
        if (path1.size() > path2.size()) { //让两个路径等长
            while (path1.size() != path2.size()) {
                path1.pop();
            }
        } else {
            while (path1.size() != path2.size()) {
                path2.pop();
            }
        }
        if (path1 == path2) {//当两个节点在一条路径上时
            path1.pop();
            return path1.pop();
        } else {
            BinaryTreeNode p = path1.pop();
            BinaryTreeNode q = path2.pop();
            while (q != p) {
                p = path1.pop();
                q = path2.pop();
            }
            return p;
        }
    }

    /**
     * 若树是普通树，但有指向父节点的指针，类似于求两个链表的第一个公共节点。由于每个节点的深度最多为log n
     * 时间复杂度为O(log n),空间复杂度O(1)
     *
     * @param root
     * @param node1
     * @param node2
     * @return
     */
    public static BinaryTreeNode getLowestCommonAncestor3(BinaryTreeNode root, BinaryTreeNode node1, BinaryTreeNode node2) {
        if (root == null || node1 == null || node2 == null) {
            return null;
        }
        int depth1 = findTheDepthOfTheNode(node1, node2);
        if (depth1 == -1) {
            return node2.parentNode;
        }
        int depth2 = findTheDepthOfTheNode(node2, node1);
        if (depth2 == -1) {
            return node1.parentNode;
        }
        //p指向较深的节点q指向较浅的节点
        BinaryTreeNode p = depth1 > depth2 ? node1 : node2;
        BinaryTreeNode q = depth1 > depth2 ? node2 : node1;
        int depth = Math.abs(depth1 - depth2);
        while (depth > 0) {
            p = p.parentNode;
            depth--;
        }
        while (p != q) {
            p = p.parentNode;
            q = q.parentNode;
        }
        return p;
    }

    /**
     * 获得根节点到node节点的路径
     *
     * @param root
     * @param node
     * @param path
     * @return
     */
    public static boolean getThePathOfTheNode(BinaryTreeNode root, BinaryTreeNode node, Stack<BinaryTreeNode> path) {
        path.push(root);
        if (root == node) {
            return true;
        }
        boolean found = false;
        if (root.leftNode != null) {
            found = getThePathOfTheNode(root.leftNode, node, path);
        }
        if (!found && root.rightNode != null) {
            found = getThePathOfTheNode(root.rightNode, node, path);
        }
        if (!found) {
            path.pop();
        }
        return found;
    }

    /**
     * 求node1的深度
     * 如果node1和node2在一条路径上，则返回-1，否则返回node1的深度
     *
     * @param node1
     * @param node2
     * @return
     */
    public static int findTheDepthOfTheNode(BinaryTreeNode node1, BinaryTreeNode node2) {
        int depth = 0;
        while (node1.parentNode != null) {
            node1 = node1.parentNode;
            depth++;
            if (node1 == node2) {
                return -1;
            }
        }
        return depth;
    }

}
