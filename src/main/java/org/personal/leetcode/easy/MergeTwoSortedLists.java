package org.personal.leetcode.easy;

public class MergeTwoSortedLists {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(list1, list2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {//if any of the lists are empty no need to do further stuff
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }/*Merging two sorted linked lists: [1, 2] and [2, 3]Initial function call: sortedMerge(head1, head2)head1 points to 1, head2 points to 21. Compare head1 (1) and head2 (2):- 1 < 2, so we take head1 (1) and call sortedMerge(head1.next, head2)2. Next call: sortedMerge(head1.next, head2)- head1 now points to 2, head2 still points to 23. Compare head1 (2) and head2 (2):- 2 <= 2, so we take head1 (2) and call sortedMerge(head1.next, head2)4. Next call: sortedMerge(head1.next, head2)- head1 is now null, head2 points to 25. Base case: head1 is null, return head2 (2)Backtrack and link nodes:- Link 1 -> 2 (from head1)- Link 2 -> 2 (from head2)- Link 2 (from head2) -> 3 (next node)Final merged list: 1 -> 2 -> 2 -> 3*/
        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
