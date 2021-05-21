//Find the number of bits to change to convert a to b(0)
package rwitesh.bitmanipulation;

import java.util.Scanner;

public class Bit_Masking_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

        int res = n;
        int i = 0;

        while (n != 0) {
            n = n & (n - 1);
            i++;
        }

        System.out.println("Number of bits to convert " + res + " to 0: " + i);

        sc.close();
    }
}
