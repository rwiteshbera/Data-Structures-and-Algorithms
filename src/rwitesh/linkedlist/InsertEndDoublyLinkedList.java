package rwitesh.linkedlist;

class nodeClass2{
    int data;
    nodeClass2 next;
    nodeClass2 prev;
    nodeClass2(int x)
    {
        data = x;
        next = null;
        prev = null;
    }
}
public class InsertEndDoublyLinkedList {
    static nodeClass2 insertEnd(nodeClass2 head, int data)
    {
        nodeClass2 temp = new nodeClass2(data);

        if (head==null)
        {
            return temp;
        }

        nodeClass2 current = head;
        while (current.next!=null)
        {
            current = current.next;
        }
        current.next = temp;
        temp.prev = current;
        return head;
    }

    public static void main(String[] args) {
        nodeClass2 head = new nodeClass2(10);
        nodeClass2 temp1 = new nodeClass2(20);
        nodeClass2 temp2 = new nodeClass2(30);

        head.next = temp1;
        temp1.next = temp2;
        temp2.prev = temp1;
        temp1.prev = head;

        printlist(head);

        int x = 999;
        head = insertEnd(head, x);
        printlist(head);
    }

    public static void printlist(nodeClass2 head) {
        nodeClass2 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
