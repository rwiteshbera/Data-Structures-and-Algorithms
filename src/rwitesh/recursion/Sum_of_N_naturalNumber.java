//Find the sum of N Natural Number using Recursion
package rwitesh.recursion;
import java.util.Scanner;

public class Sum_of_N_naturalNumber {
        static int sum(int n)
        {
            if(n==1)
            {
                return  1;
            }
            else if(n==0)
            {
                return  0;
            }
            else
            {
                return n+sum(n-1);
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int numb = sc.nextInt();

        System.out.println("Sum of first "+ numb + " natural number is " + sum(numb));

        sc.close();
    }
}
