package com.so;

import org.junit.Test;

/**
 * 第17题
 * 输入两个递增的链表，合并这两个链表并使新链表仍然是递增的
 *
 * @author qgl
 * @date 2019/03/03
 */
public class Test17 {
    @Test
    public void test17() throws Exception {
        MergeLinked17.ListNode head1 = new MergeLinked17.ListNode();
        MergeLinked17.ListNode second1 = new MergeLinked17.ListNode();
        MergeLinked17.ListNode head2 = new MergeLinked17.ListNode();
        MergeLinked17.ListNode second2 = new MergeLinked17.ListNode();
        MergeLinked17.ListNode third2 = new MergeLinked17.ListNode();
        head1.nextNode = second1;
        head2.nextNode = second2;
        second2.nextNode = third2;
        head1.data = 1;
        second1.data = 5;
        head2.data = 2;
        second2.data = 4;
        third2.data = 7;

        MergeLinked17.ListNode result1 = MergeLinked17.mergeTwoLists1(head1, head2);
        System.out.println("解法一：" + printList(result1));

//        MergeLinked17.ListNode result2 = MergeLinked17.mergeTwoLists2(head1, head2);
//        System.out.println("解法二：" + printList(result2));
    }

    /**
     * 输出合并后的链表
     *
     * @param root
     * @return
     */
    public static String printList(MergeLinked17.ListNode root) {
        if (root == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();

        MergeLinked17.ListNode p = root;
        while (p != null) {
            sb.append(p.data).append(",");
            p = p.nextNode;
        }
        return String.valueOf(sb);
    }
}
