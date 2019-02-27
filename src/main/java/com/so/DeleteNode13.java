package com.so;

/**
 * 第13题
 * 给定单向链表的头指针和一个节点，在O(1)时间删除该节点。
 *
 * @author qgl
 * @date 2017/08/09
 */
public class DeleteNode13 {

    /**
     * 自定义链表
     */
    static class ListNode {
        int data;
        ListNode nextNode;
    }

    /**
     * 删除链表的某个节点
     * @param head 头指针
     * @param deListNode 待删除的节点
     */
    public static void deleteNode(ListNode head, ListNode deListNode) {
        if (deListNode == null || head == null)
            return;

        if (head == deListNode) {
            head = null;
        } else {
            // 若删除节点是末尾节点，往后移一个
            if (deListNode.nextNode == null) {
                ListNode pointListNode = head;
                while (pointListNode.nextNode.nextNode != null) {
                    pointListNode = pointListNode.nextNode;
                }
                pointListNode.nextNode = null;
            } else {
                deListNode.data = deListNode.nextNode.data;
                deListNode.nextNode = deListNode.nextNode.nextNode;
            }
        }
    }
}


