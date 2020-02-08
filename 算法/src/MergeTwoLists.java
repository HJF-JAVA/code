package main.java; /**
 * @author 柘木
 * @date 2019-10-19
 */

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * 算法
 * 我们直接将以上递归过程建模，首先考虑边界情况。
 * 特殊的，如果 l1 或者 l2 一开始就是 null ，那么没有任何操作需要合并，所以我们只需要返回非空链表。
 * 否则，我们要判断 l1 和 l2 哪一个的头元素更小，然后递归地决定下一个添加到结果里的值。如果两个链表都是空的，
 * 那么过程终止，所以递归过程最终一定会终止。
 *
 */
public class MergeTwoLists {

    // l2:  134  1
    // l1:  124

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }

    /**
     *         ListNode l1 = new ListNode(1);
     *         ListNode l2 = new ListNode(2);
     *         ListNode l3 = new ListNode(4);
     *         ListNode m1 = new ListNode(1);
     *         ListNode m2 = new ListNode(3);
     *         ListNode m3 = new ListNode(4);
     *
     *         l1.next = l2;
     *         l2.next = l3;
     *         l3.next = null;
     *
     *         m1.next = m2;
     *         m2.next = m3;
     *         m3.next = null;
     */
}
