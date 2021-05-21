//Sample code of Recursion
package rwitesh.recursion;
import java.util.Scanner;

public class recursion1 {
    static  void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n + " ");
        fun(n-1);
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of test: ");
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        fun(test);
        sc.close();
    }
}
