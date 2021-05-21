package rwitesh.linkedlist;

import java.util.Scanner;

class NodeCheck {
    int data;
    NodeCheck next;
    NodeCheck(int x)
    {
        data = x;
        next = null;
    }
}

public class CheckElementInLinkedList {
    static boolean CheckElements(NodeCheck head, int x)
    {
        NodeCheck current = head;
        while (current!=null)
        {
            if (current.data == x)
            {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        NodeCheck head = new NodeCheck(10);
        head.next = new NodeCheck(20);
        head.next.next = new NodeCheck(30);
        head.next.next.next = new NodeCheck(40);
        PrintList(head);
        System.out.println("");
        int element;
        System.out.print("Check element: ");
        Scanner sc =new Scanner(System.in);
        element = sc.nextInt();

        if (CheckElements(head, element))
        {
            System.out.println("Element found.");
        }
        else
        {
            System.out.println("Element not found.");
        }
    }

    static void PrintList(NodeCheck head)
    {
        NodeCheck current = head;
        while (current!=null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
