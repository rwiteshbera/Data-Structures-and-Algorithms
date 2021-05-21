//Finding number of digits in an number
//Example - 1216 -> 4
//123 ->3
package rwitesh.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numberOfDigits {
    static int Digits(long num)
    {
        int count = 0;
        while(num>0)
        {
            num = num/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args)
    throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        long num = Long.parseLong(b.readLine());

        System.out.println("The number of digits: " + Digits(num));
    }
}
