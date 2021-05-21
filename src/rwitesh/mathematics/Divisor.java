package rwitesh.mathematics;

import java.util.Scanner;

public class Divisor {
    static void DivisorOfNumber(int n)
    {
        int i = 1;
        while (n>=i)
        {
            if(n%i==0)
            {
                System.out.print(i + " ");
            }
            i++;
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        DivisorOfNumber(num);
    }
}
