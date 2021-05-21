package rwitesh.mathematics;

import java.util.Scanner;

public class PrimeNumber2 {
    static boolean checkPrime(int num)
    {
        if(num==1)
        {
            return false;
        }
        for(int i = 2; i*i<=num; i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        if (checkPrime(num)==false)
        {
            System.out.println("Not A Prime Number");
        }
        else
        {
            System.out.println("Prime number");
        }
    }
}
