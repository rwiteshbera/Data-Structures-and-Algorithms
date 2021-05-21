//Recursive solution
package rwitesh.mathematics;

import java.util.Scanner;

public class Factorial {
    static long Fact(long n)
    {
        if(n==0)
            return 1;
        return n*Fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        System.out.println("The factorial is " + Fact(num));
    }
}
