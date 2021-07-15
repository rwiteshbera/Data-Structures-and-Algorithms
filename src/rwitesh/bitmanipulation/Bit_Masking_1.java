//Count number of bits to be flipped to convert A to B
// or
// Count the number of set bits
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
