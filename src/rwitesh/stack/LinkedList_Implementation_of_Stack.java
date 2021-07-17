package rwitesh.stack;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

class Stack{
    Node head;
    int size;
    Stack(){
        head = null;
        size = 0;
    }

    void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    int pop(){
        if(head==null) {return Integer.MAX_VALUE;}
        else{
            int res = head.data;
            head = head.next;
            size--;
            return res;
        }
    }

    int peek(){
        if (head==null) {return Integer.MAX_VALUE;}
        else{
            return head.data;
        }
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return head==null;
    }
}
public class LinkedList_Implementation_of_Stack {
    public static void main(String[] args) {
            MyStack obj = new MyStack(5);
                                // NULL
            obj.push(5);    // [5] -> NULL
            obj.push(11);   // [11] -> [5] -> NULL
            obj.push(16);   // [16] -> [11] -> [5] -> NULL

        System.out.println(obj.pop()); // [11] -> [5] -> NULL
        System.out.println(obj.size()); // 2
        System.out.println(obj.peek()); // 11
        System.out.println(obj.isEmpty()); // false
    }
}
