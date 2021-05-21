package rwitesh.linkedlist;

import java.util.Scanner;

class NodeClass4 {
    int data;
    NodeClass4 next;
    NodeClass4(int x)
    {
        data = x;
        next = null;
    }
}

public class InsertGivenPosLinkedList {
    public static void main(String[] args) {
        NodeClass4 head = new NodeClass4(1);
        head.next = new NodeClass4(2);
        head.next.next = new NodeClass4(3);
        head.next.next.next = new NodeClass4(4);
        head.next.next.next.next = new NodeClass4(5);

        int position, data;
        System.out.println("Enter a data and its position: ");
        Scanner sc = new Scanner(System.in);
        data = sc.nextInt();
        position = sc.nextInt();

        head = insertNode(head, position, data);
        PrintList(head);
    }

    static NodeClass4 insertNode(NodeClass4 head, int position, int data)
    {
        NodeClass4 temp = new NodeClass4(data);
        if (position==1)
        {
            temp.next = head;
            return temp;
        }

        NodeClass4 current = head;
        for(int i=1; i<=position-2 && current!=null; i++) // The loop is used to get the previous element of the position
        {
            current = current.next;
        }

        if (current==null)
        {
            return head;
        }

        temp.next = current.next;
        current.next = temp;

        return head;
    }

    static void PrintList(NodeClass4 head)
    {
        NodeClass4 current = head;
        while (current!=null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
