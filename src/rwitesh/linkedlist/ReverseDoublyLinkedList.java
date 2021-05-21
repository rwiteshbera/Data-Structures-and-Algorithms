package rwitesh.linkedlist;

class node1{
    int data;
    node1 next;
    node1 prev;
    node1(int x)
    {
        data = x;
        next = null;
        prev = null;
    }
}

public class ReverseDoublyLinkedList {
    static node1 reverse(node1 head)
    {
        node1 temp = null;
        node1 current = head;
            if (head==null) return null;
            if (head.next==null) return head;
            while (current!=null)
            {
                temp = current.prev;
                current.prev = current.next;
                current.next = temp;
                current = current.prev;
            }
            return temp.prev;
    }

    public static void main(String[] args) {
        node1 head =  new node1(10);
        node1 temp1 = new node1(20);
        node1 temp2 = new node1(30);

        head.next = temp1;
        temp1.next = temp2;
        temp2.prev = temp1;
        temp1.prev = head;

        printList(head);
        head = reverse(head);
        printList(head);
    }

    static void printList(node1 head)
    {
        node1 current = head;
        while (current!=null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
