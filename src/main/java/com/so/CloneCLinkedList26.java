package com.so;

/**
 * 第26题
 * 复制一个复杂链表
 *
 * @author qgl
 * @date 2017/08/13
 */
public class CloneCLinkedList26 {
    /**
     * 复杂链表
     */
    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    /**
     * 解法一
     * @param pHead
     * @return
     */
    public static RandomListNode Clone1(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        RandomListNode pCur = pHead;
        //复制next 如原来是A->B->C 变成A->A'->B->B'->C->C'
        while (pCur != null) {
            RandomListNode node = new RandomListNode(pCur.label);
            node.next = pCur.next;
            pCur.next = node;
            pCur = node.next;
        }
        pCur = pHead;
        //复制random pCur是原来链表的结点 pCur.next是复制pCur的结点
        while (pCur != null) {
            if (pCur.random != null) {
                pCur.next.random = pCur.random.next;
            }
            pCur = pCur.next.next;
        }
        RandomListNode head = pHead.next;
        RandomListNode cur = head;
        pCur = pHead;
        //拆分链表
        while (pCur != null) {
            pCur.next = pCur.next.next;
            if (cur.next != null) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
            pCur = pCur.next;
        }
        return head;
    }

    /**
     * 解法二
     * @param pHead
     * @return
     */
    public static RandomListNode Clone2(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        RandomListNode head = new RandomListNode(pHead.label);
        RandomListNode temp = head;

        while (pHead.next != null) {
            temp.next = new RandomListNode(pHead.next.label);
            if (pHead.random != null) {
                temp.random = new RandomListNode(pHead.random.label);
            }
            pHead = pHead.next;
            temp = temp.next;
        }
        return head;
    }
}

