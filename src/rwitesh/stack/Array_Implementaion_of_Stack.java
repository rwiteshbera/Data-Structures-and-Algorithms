package rwitesh.stack;

class MyStack {
    int [] arr;
    int capacity;
    int topIndex;

    MyStack(int c){
        topIndex = -1;
        capacity = c;
        arr = new int[capacity];
    }

    void push(int x){
        if (topIndex>=capacity) {
            System.out.println("Stack Overflow");
        }
        else{
            topIndex++;
            arr[topIndex] = x;
        }
    }

    int pop(){
        if(topIndex==-1) {
            System.out.println("Stack Underflow");
            return 0;
        }else {
            int res = arr[topIndex];
            topIndex--;
            return res;
        }
    }

    int peek(){
        if (topIndex==-1){
            return Integer.MAX_VALUE;
        }else {
            return arr[topIndex];
        }
    }
    int size(){
        return ++topIndex;
    }

    boolean isEmpty(){
        return topIndex == -1;
    }
}
public class Array_Implementaion_of_Stack {
    public static void main(String[] args) {
        MyStack s = new MyStack(10);
        s.push(12);
        s.push(15);
        s.push(20);
        System.out.println(s.pop());
        s.push(30);
        System.out.println(s.isEmpty());
        System.out.println(s.capacity);
        System.out.println(s.size());
        System.out.println(s.peek());
    }
}
