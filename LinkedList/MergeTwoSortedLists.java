package LinkedList;

public class MergeTwoSortedLists {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and Tail for each linked list
    Node head;
    Node tail;

    // Add node at end
    public void createNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Merge two sorted linked lists (Recursive)
    public Node mergeTwoLists(Node list1, Node list2) {

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if (list1.data <= list2.data) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    // Print linked list
    public void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        MergeTwoSortedLists l1 = new MergeTwoSortedLists();
        MergeTwoSortedLists l2 = new MergeTwoSortedLists();

        // First Sorted List
        l1.createNode(4);
        l1.createNode(6);
        l1.createNode(8);

        // Second Sorted List
        l2.createNode(2);
        l2.createNode(5);
        l2.createNode(10);

        System.out.println("List 1:");
        l1.printLL(l1.head);

        System.out.println("List 2:");
        l2.printLL(l2.head);

        // Merge both lists
        Node mergedHead = l1.mergeTwoLists(l1.head, l2.head);

        System.out.println("Merged List:");
        l1.printLL(mergedHead);
    }
}