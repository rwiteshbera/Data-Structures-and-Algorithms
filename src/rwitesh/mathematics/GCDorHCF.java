//Calculate GCD or HCF of two numbers
package rwitesh.mathematics;

import java.util.Scanner;

public class GCDorHCF {
    static int GCD(int m, int n)
    {
        int res = Math.min(m,n);
        while (res>0)
        {
            if(m%res==0 && n%res==0)
            {
                break;
            }
            res--;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD or HCF of " + a + " and " + b + " is " + GCD(a,b));
    }
}

//Time Complexity: O(minimum of a and b) <--Worst Case
