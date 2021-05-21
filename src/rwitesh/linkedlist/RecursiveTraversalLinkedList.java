package rwitesh.linkedlist;

/* If there is N nodes, then the recursive function will be called for (N+1)times. because it will check for the null also. And each function call will take an auxiliary space. Hence the total Auxiliary space is O(N), so iterative solution is much better than recursive solution.*/

class Node2{
    int data;
    Node2 next;
    Node2(int x)
    {
        data = x;
        next = null;
    }
}
public class RecursiveTraversalLinkedList {
    public static void main(String[] args) {
        Node2 head = new Node2(10);
        head.next  = new Node2(20);
        head.next.next = new Node2(30);
        head.next.next.next = new Node2(40);

        recursionPrint(head);
    }
    public static void recursionPrint(Node2 head)
    {
        if (head == null)
        {
            return;
        }
        System.out.print(head.data + " ");
        recursionPrint(head.next);
    }
}
