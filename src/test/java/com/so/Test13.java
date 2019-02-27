package com.so;

import org.junit.Test;

/**
 * 第13题
 * 给定单向链表的头指针和一个节点，在O(1)时间删除该节点。
 *
 * @author qgl
 * @date 2019/02/27
 */
public class Test13 {
    @Test
    public void test13() throws Exception {
        DeleteNode13.ListNode head = new DeleteNode13.ListNode();
        DeleteNode13.ListNode second = new DeleteNode13.ListNode();
        DeleteNode13.ListNode third = new DeleteNode13.ListNode();
        head.nextNode = second;
        second.nextNode = third;
        head.data = 1;
        second.data = 2;
        third.data = 3;

        // 删除链表第二个节点
        DeleteNode13.deleteNode(head, second);

        // 输出链表的值
        printListNode(head);
    }

    /**
     * 输出链表的所有值
     * @param head
     */
    public void printListNode(DeleteNode13.ListNode head) {
        DeleteNode13.ListNode tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.nextNode;
        }
    }
}
