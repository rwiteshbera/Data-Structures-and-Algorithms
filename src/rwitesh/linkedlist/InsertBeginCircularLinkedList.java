package rwitesh.linkedlist;

class node3{
    int data;
    node3 next;
    node3(int x)
    {
        data = x;
        next = null;
    }
}

public class InsertBeginCircularLinkedList {
    //Efficient Approach - Time Complexity : O(1)
    static node3 insertBegin(node3 head, int data)
    {
        node3 temp = new node3(data);
        if (head==null)
        {
            temp.next = temp;
            return temp;
        }
        else {
            temp.next = head.next;
            head.next = temp;

            int current = temp.data;
            temp.data = head.data;
            head.data= current;
        }
        return head;
    }

    public static void main(String[] args) {
        node3 head = new node3(10);
        node3 temp1 = new node3(20);
        node3 temp2 = new node3(30);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = head;

        printList(head);
        head = insertBegin(head,999);
        printList(head);
    }

    static void printList(node3 head) {
        if (head == null) {
            System.out.println("NULL");
        } else {
            node3 current = head;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }
}
