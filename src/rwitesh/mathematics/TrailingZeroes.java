//Given an integer n, write a function that returns count of trailing zeroes in n!.
/*
 Input: n = 20
 Output: 4
 Factorial of 20 is 2432902008176640000 which has
 4 trailing zeroes.
 */

package rwitesh.mathematics;

import java.util.Scanner;

public class TrailingZeroes {
    static int TrailingZ(int num)
    {
        int count = 0;
        for(int i = 5; i<=num; i=i*5)
        {
            count = count + (num/i);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The number of trailing zeroes: " + TrailingZ(n));
    }
}
