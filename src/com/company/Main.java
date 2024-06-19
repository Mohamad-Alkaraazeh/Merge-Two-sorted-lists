package com.company;

/*
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
        // Initialisierung der ersten Liste: [1, 2, 4]
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next = new ListNode(4);

        // Initialisierung der zweiten Liste: [1, 3, 4]
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // Aufruf der mergeTwoLists Methode und Ausgabe der gemischten Liste
        ListNode mergedList = mergeTwoLists(list1, list2);

        // Ausgabe der gemischten Liste
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy-Knoten zur Erleichterung der Listenverkettung
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Anhängen der verbleibenden Knoten der nicht leeren Liste
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next; // Der erste Knoten ist der Dummy, daher geben wir dummy.next zurück
    }
}*/


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

