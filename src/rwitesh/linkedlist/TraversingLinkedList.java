package rwitesh.linkedlist;

class Node1
{
    int data;
    Node1 next;
    Node1 (int x)
    {
        data = x;
        next = null;
    }
}
public class TraversingLinkedList {
    public static void main(String[] args) {
        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(30);
        head.next.next.next = new Node1(40);

        printList(head);
    }

    public static void printList(Node1 head)
    {
        Node1 current = head;
        while (current!=null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

//Time Complexity: O(N)
