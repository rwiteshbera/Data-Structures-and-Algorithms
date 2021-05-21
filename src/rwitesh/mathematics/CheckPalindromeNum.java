package rwitesh.mathematics;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckPalindromeNum {
    static boolean PalindromeNumber(int num) // 12321
    {
        int temp = num;
       int reverse = 0;
       while(num>0)
       {
           reverse = (reverse*10) + (num%10);
           num = num/10;
       }

//       if (temp != reverse)
//       {
//           return false;
//       }
//       return true;

        return (temp==reverse);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            int n = sc.nextInt();

            if(PalindromeNumber(n))
            {
                System.out.println("Palindrome.");
            }
            else
            {
                System.out.println("Not a palindrome.");
            }
        }
        catch (Exception e)
        {
            System.out.println("An error occured: ");
            System.out.println(e);
        }


    }
}
