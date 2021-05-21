package rwitesh.linkedlist;

class nodeClass1
{
    int data;
    nodeClass1 next;
    nodeClass1 prev;
    nodeClass1 (int x)
    {
        data = x;
        next = null;
        prev = null;
    }
}
public class InsertBeginDoublyLinkedList {
    static nodeClass1 insertBegin(nodeClass1 head, int data)
    {
        nodeClass1 temp = new nodeClass1(data);
        if (head!=null)
        {
            temp.next = head;
        }
        return temp;
    }

    public static void main(String[] args) {
        nodeClass1 head = new nodeClass1(10);
        nodeClass1 temp1 = new nodeClass1(20);
        nodeClass1 temp2 = new nodeClass1(30);

        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev =head;

        printlist(head);

        int data = 999;
        head = insertBegin(head, data);
        printlist(head);

    }

    public static void printlist(nodeClass1 head) {
        nodeClass1 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
