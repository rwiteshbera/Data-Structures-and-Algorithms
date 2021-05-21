package rwitesh.linkedlist;

class ListNode
{
    int data;
    ListNode next;

    ListNode(int x)
    {
        data = x;
        next = null;
    }
}

public class InsertBeginSinglyLinkedlist {

    public static void main(String[] args) {
        ListNode head = null;
        head = insertBegin(head,10);
        head = insertBegin(head, 20);
        head = insertBegin(head, 30);
        printLinkedList(head);
    }

    static ListNode insertBegin(ListNode head, int x)
    {
        ListNode temp = new ListNode(x);
        temp.next = head;
        return temp;
    }

    static void printLinkedList(ListNode head)
    {
        ListNode current = head;
        while (current!=null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

