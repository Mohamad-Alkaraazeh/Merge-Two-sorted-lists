/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Example1: 
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]


Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]
    */



package com.company;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Main {

    public static void main(String[] args) {
        //Initialising the first list
        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(4);

        //Initialising the second list
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        //Call the mergeTwoLists method and output the merged list
        ListNode mergedList = mergeTwoLists(list1, list2);

        //output
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //in case that the first list is empty
        if (list1 == null) return list2;
        //the second one is empty
        if (list2 == null) return list1;

        //if both are not empty
        if (list1.val <= list2.val) {
            //Recursive call
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}

