package rwitesh.linkedlist;

class newNode{
    int data;
    newNode next;
    newNode(int x)
    {
        data = x;
        next = null;
    }
}

public class InsertEndCircularLinkedList {

    //Efficient Approach = Time Complexity : O(1)
    static newNode insertEnd(newNode head, int data)
    {
        newNode temp = new newNode(data);
        if (head==null)
        {
            temp.next = temp;
            return temp;
        }
        else
        {
            temp.next = head.next;
            head.next = temp;

            int current = temp.data;
            temp.data = head.data;
            head.data= current;
            return temp;
        }

    }
    public static void main(String[] args) {
        newNode head = new newNode(10);
        head.next = new newNode(20);
        head.next.next = new newNode(30);
        head.next.next.next = head;

        printList(head);
        head = insertEnd(head,9999);
        printList(head);
    }

    static void printList(newNode head) {
        if (head == null) {
            System.out.println("NULL");
        } else {
            newNode current = head;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }
}