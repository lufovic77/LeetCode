package org.leetcode;

public class AddTwoNumbers {
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

    static class Solution {
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode pointer1 = l1;
            ListNode pointer2 = l2;
            ListNode result = new ListNode();
            ListNode start = result;
            int addNum = 0;
            while (true) {
                int num1 = pointer1 == null ? 0 : pointer1.val;
                int num2 = pointer2 == null ? 0 : pointer2.val;
                int tmp = num1 + num2 + addNum;
                result.val = tmp % 10;
                addNum = tmp / 10;
                pointer1 = pointer1 == null ? null : pointer1.next;
                pointer2 = pointer2 == null ? null : pointer2.next;

                if (pointer1 == null && pointer2 == null) {
                    if (addNum != 0) {
                        result.next = new ListNode(addNum);
                    }
                    return start;
                }

                ListNode tmpNode = new ListNode();
                result.next = tmpNode;
                result = tmpNode;
            }
        }

        public static void main(String[] args) {
            ListNode listNode = new ListNode(9);

            ListNode listNode4 = new ListNode(9);
            ListNode listNode1 = new ListNode(9, listNode4);
            ListNode listNode2 = new ListNode(1, listNode1);

            ListNode listNode3 = Solution.addTwoNumbers(listNode, listNode2);
            ListNode tmp = listNode3;
            System.out.println();
            while (tmp != null) {
                System.out.println(tmp.val);
                tmp = tmp.next;
            }
        }
    }
}
