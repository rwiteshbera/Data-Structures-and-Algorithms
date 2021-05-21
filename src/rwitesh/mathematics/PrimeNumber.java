//Brute Force Method to check whether a given number is prime or not
package rwitesh.mathematics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int i = 1;
        while (i<=num)
        {
            if(num%i==0)
            {
                count++;
            }
            i++;
        }

        if(count==2)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a Prime Number");
        }
    }
}
