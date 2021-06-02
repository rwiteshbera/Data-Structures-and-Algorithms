/*
* In this code, Two different approches are used
* 1. Iterative
* 2. Recursive
* */
package rwitesh.linkedlist;

import java.util.Scanner;

class NodeSearch {
    int data;
    NodeSearch next;
    NodeSearch(int x)
    {
        data = x;
        next = null;
    }
}

public class Search_In_LinkedList {

    //Iterative Search Function
    static int IterativeSearch(NodeSearch head, int element)
    {
        int position = 1;
        NodeSearch current = head;
        while (current!=null)
        {
            if(current.data == element)
            {
                return position;
            }
            else
            {
                position++;
                current =  current.next;
            }
        }
        return  -1;
    }

    //Recursive Search Function
    static int RecursiveSearchFunc(NodeSearch head, int element)
    {
        NodeSearch current = head;
        if (current == null) return  -1;
        if (current.data == element)
        {
            return 1;
        }
        else
        {
            int res = RecursiveSearchFunc(current.next,element);
            if (res==-1) return -1;
            else
            {
                return (res+1);
            }
        }
    }

    public static void main(String[] args) {
        NodeSearch head = new NodeSearch(10);
        head.next = new NodeSearch(20);
        head.next.next = new NodeSearch(30);
        head.next.next.next = new NodeSearch(40);
        head.next.next.next.next = new NodeSearch(50);

        printList(head);
        System.out.println();

        System.out.print("Search an element: ");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();

        //System.out.println("The position is: " + IterativeSearch(head,element));
        System.out.println("The position is: " + RecursiveSearchFunc(head,element));

    }

    static void printList(NodeSearch head)
    {
        NodeSearch current = head;
        while (current!=null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
