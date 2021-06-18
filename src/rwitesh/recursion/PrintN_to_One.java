package rwitesh.recursion;

public class PrintN_to_One {
    static void fun(int n){
        if(n==0) return;
        else
            System.out.print(n + " ");
            fun(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        fun(n);
    }
}
