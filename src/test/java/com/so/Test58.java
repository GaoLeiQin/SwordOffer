package com.so;

import org.junit.Test;

/**
 * 第58题
 * 给定一个二叉树的某个结点，请找出中序遍历顺序的下一个结点并且返回
 *
 * @author qgl
 * @date 2019/04/14
 */
public class Test58 {

    @Test
    public void test58() throws Exception {
        NextTreeNode58.TreeLinkNode root = new NextTreeNode58.TreeLinkNode(4);
        NextTreeNode58.TreeLinkNode first = new NextTreeNode58.TreeLinkNode(2);
        NextTreeNode58.TreeLinkNode second = new NextTreeNode58.TreeLinkNode(6);
        NextTreeNode58.TreeLinkNode three = new NextTreeNode58.TreeLinkNode(1);
        NextTreeNode58.TreeLinkNode four = new NextTreeNode58.TreeLinkNode(3);
        root.left = first;
        root.right = second;
        first.left = three;
        first.right = four;

        System.out.println("输入节点的下一个节点值：" + NextTreeNode58.getTreeLinkNextNode(first).val);
    }
}
