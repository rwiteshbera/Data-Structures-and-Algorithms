package rwitesh.linkedlist;

class NodeClass{
    int data;
    NodeClass next;
    NodeClass(int x)
    {
        data = x;
        next = null;
    }
}

public class InsertEndSinglyLinkedList {
    public static void main(String[] args) {
            NodeClass head = null;
            head = insertEnd(head,20);
            head = insertEnd(head,40);
            printList(head);
    }

    static NodeClass insertEnd(NodeClass head, int x)
    {
        NodeClass temp = new NodeClass(x);
        if (head==null) return temp; // Handling the corner case

        NodeClass current = head;
        while (current.next!=null)
        {
            current = current.next;
        }
        current.next = temp;
        return head;
    }

    static void printList(NodeClass head)
    {
        NodeClass current = head;
        while (current!=null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
