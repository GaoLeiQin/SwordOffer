package com.so;

import org.junit.Test;

/**
 * 第57题
 * 删除链表的重复节点
 *
 * @author qgl
 * @date 2019/04/13
 */
public class Test57 {

    @Test
    public void test57() throws Exception {
        DeleteDuplication57.ListNode head = new DeleteDuplication57.ListNode(6);
        DeleteDuplication57.ListNode first = new DeleteDuplication57.ListNode(1);
        DeleteDuplication57.ListNode second = new DeleteDuplication57.ListNode(3);
        DeleteDuplication57.ListNode three = new DeleteDuplication57.ListNode(3);
        DeleteDuplication57.ListNode four = new DeleteDuplication57.ListNode(5);
        head.next = first;
        first.next = second;
        second.next = three;
        three.next = four;

        System.out.println("原链表：" + printfListNode(head));
        System.out.println("删除链表的重复节点后：" + printfListNode(DeleteDuplication57.deleteDuplication(head)));
    }

    /**
     * 打印链表
     * @param head
     * @return
     */
    public String printfListNode(DeleteDuplication57.ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val).append("→");
            head = head.next;
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}
