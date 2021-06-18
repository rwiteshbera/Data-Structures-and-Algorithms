package rwitesh.recursion;

public class PrintOne_to_N {
    static void fun(int n)
    {
        if(n==0) return;
        else{
            fun(n-1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        int n = 6;
        fun(6);
    }
}
