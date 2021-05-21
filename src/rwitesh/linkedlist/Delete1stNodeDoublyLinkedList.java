package rwitesh.linkedlist;

class node2{
    int data;
    node2 next;
    node2 prev;
    node2(int x)
    {
        data = x;
        next = null;
        prev = null;
    }
}

public class Delete1stNodeDoublyLinkedList {
    static node2 deleteFirst(node2 head)
    {
        if (head==null || head.next == null) return null;
        else{
           head = head.next;
           head.prev = null;
           return head;
        }
    }

    public static void main(String[] args) {
        node2 head = new node2(10);
        node2 temp1 = new node2(20);
        node2 temp2 = new node2(30);
        node2 temp3 = new node2(40);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.prev = temp2;
        temp2.prev = temp1;
        temp1.prev = head;

        printList(head);
        head = deleteFirst(head);
        printList(head);
    }

    static void printList(node2 head)
    {
        node2 current = head;
        while (current!=null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
