package rwitesh.linkedlist;

class nodeClass4 {
    int data;
    nodeClass4 next;
    nodeClass4 prev;
    nodeClass4(int x)
    {
        data = x;
        next = null;
        prev = null;
    }
}

public class DeleteLastNodeDoubly {
    static nodeClass4 deleteLast (nodeClass4 head)
    {
        if (head==null) return null;
        if (head.next==null) return null;
        nodeClass4 current = head;
        while (current.next!=null)
        {
            current = current.next;
        }
        current.prev.next = null;
        return head;
    }

    public static void main(String[] args) {
        nodeClass4 head = new nodeClass4(10);
        nodeClass4 temp1 = new nodeClass4(20);
        nodeClass4 temp2 = new nodeClass4(30);
        nodeClass4 temp3 = new nodeClass4(40);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.prev = temp2;
        temp2.prev = temp1;
        temp1.prev = head;

        PrintList(head);
        head = deleteLast(head);
        PrintList(head);
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
