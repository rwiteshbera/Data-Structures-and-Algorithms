package rwitesh.mathematics;

import java.util.Scanner;

public class GCDorHCF_2 {
    static int GCD(int a, int b)
    {
        while(a!=b)
        {
            if(a>b)
            {
                a = a-b;
            }
            else if(b>a)
            {
                b = b-a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD or HCF of " + a + " and " + b + " is " + GCD(a,b));
    }
}
