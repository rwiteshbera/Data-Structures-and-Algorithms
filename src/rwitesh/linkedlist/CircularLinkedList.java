package rwitesh.linkedlist;

class NodeClass1 {
    int data;
    NodeClass1 next;
    NodeClass1 (int x)
    {
        data = x;
        next = null;
    }
}
public class CircularLinkedList {
    public static void main(String[] args) {
        NodeClass1 head = new NodeClass1(10);
        head.next = new NodeClass1(20);
        head.next.next = new NodeClass1(30);
        head.next.next.next = new NodeClass1(40);
        head.next.next.next.next = new NodeClass1(50);
        head.next.next.next.next.next = head;

        printList(head);
    }

    static void printList(NodeClass1 head)
    {
        if (head==null)
        {
            System.out.println("NULL");
        }
        else {
            NodeClass1 current = head;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }
}
