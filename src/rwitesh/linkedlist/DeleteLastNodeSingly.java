package rwitesh.linkedlist;

class NodeClass3{
    int data;
    nodeClass4 next;
    NodeClass3(int x)
    {
        data = x;
        next = null;
    }
}

public class DeleteLastNodeSingly {
    public static void main(String[] args) {
        nodeClass4 head = new nodeClass4(10);
        head.next = new nodeClass4(20);
        head.next.next = new nodeClass4(30);

        PrintList(head);
        head = deleteLast(head);
        PrintList(head);
    }

    static nodeClass4 deleteLast(nodeClass4 head)
    {
        if (head==null) return null;
        if (head.next == null) return null;

        nodeClass4 current = head;
        while (current.next.next!=null)
        {
            current = current.next;
        }
        current.next = null;

        return head;
    }

    static void PrintList(nodeClass4 head)
    {
        nodeClass4 current = head;
        while (current!=null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
