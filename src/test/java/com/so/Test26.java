package com.so;

import org.junit.Test;

/**
 * 第26题
 * 复制一个复杂链表
 *
 * @author qgl
 * @date 2019/03/12
 */
public class Test26 {
    @Test
    public void test26() throws Exception {
        CloneCLinkedList26.RandomListNode root = new CloneCLinkedList26.RandomListNode(1);
        CloneCLinkedList26.RandomListNode node1 = new CloneCLinkedList26.RandomListNode(2);
        CloneCLinkedList26.RandomListNode node2 = new CloneCLinkedList26.RandomListNode(3);
        CloneCLinkedList26.RandomListNode node3 = new CloneCLinkedList26.RandomListNode(4);
        CloneCLinkedList26.RandomListNode node4 = new CloneCLinkedList26.RandomListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        root.random = node1;
        node1.random = root;
        node3.random = node1;

        System.out.println("解法一：" + CloneCLinkedList26.Clone1(root).label);
        System.out.println("解法二：" + CloneCLinkedList26.Clone2(root).label);
    }
}
