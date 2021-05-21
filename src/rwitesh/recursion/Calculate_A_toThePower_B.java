package rwitesh.recursion;

import java.util.Scanner;

public class Calculate_A_toThePower_B {
    static int ExponentialCalculation(int m, int  n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return m * ExponentialCalculation(m,n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        System.out.println("The value of " + base + " to the power " + power + " is " + ExponentialCalculation(base,
                power));

        sc.close();
    }
}
