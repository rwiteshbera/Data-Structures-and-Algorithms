//Efficient code to get Divisor of a number
package rwitesh.mathematics;

import java.util.Scanner;

public class Divisor_2 {
    static void GetDivisor(int n)
    {
        for(int i = 1; i*i<=n; i++)
        {
            if(n%i==0)
            {
                System.out.print(i + " ");
                System.out.println(n/i + " ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        GetDivisor(num);
    }
}
