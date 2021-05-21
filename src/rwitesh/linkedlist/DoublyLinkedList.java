package rwitesh.linkedlist;

class nodeClass
{
    int data;
    nodeClass next;
    nodeClass prev;
    nodeClass(int x)
    {
        data = x;
        next = null;
        prev = null;
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        nodeClass head = new nodeClass(10);
        nodeClass temp1 = new nodeClass(20);
        nodeClass temp2 = new nodeClass(30);

        head.next = temp1;
        temp1.next = temp2;
        temp2.prev = temp1;
        temp1.prev = head;

        printlist(head);
    }

    public static void printlist(nodeClass head) {
        nodeClass curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
