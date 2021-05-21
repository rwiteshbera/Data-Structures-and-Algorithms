package rwitesh.linkedlist;

class NodeClass2{
    int data;
    NodeClass2 next;
    NodeClass2(int x)
    {
        data = x;
        next = null;
    }
}
public class Delete1stNodeSinglyLinkedList {
    static  NodeClass2 deleteFirst(NodeClass2 head)
    {
        if (head == null)
        {
            return null;
        }
        else {
            return head.next;
        }
    }
    public static void main(String[] args) {
            NodeClass2 head = new NodeClass2(10);
            head.next = new NodeClass2(20);
            head.next.next = new NodeClass2(30);
            head.next.next.next = new NodeClass2(40);

            head = deleteFirst(head);
            PrintList(head);
    }

    static void PrintList(NodeClass2 head)
    {
        NodeClass2 current = head;
        while (current!=null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
