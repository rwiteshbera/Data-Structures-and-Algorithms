package rwitesh.bitmanipulation;
/*
* 1) Left shift given number 1 by k-1 to create a number that has only set bit as k-th bit.
   temp = 1 << (k-1)
  2) If bitwise AND of n and temp is non-zero, then result is SET else result is NOT SET.
* */
import java.util.Scanner;

public class Check_if_ith_bit_set {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n and i: ");
        n = sc.nextInt();
        i = sc.nextInt();

        if((n&(1<<(i-1)))!=0) // Shift 1 (i-1)times to left and do
            //and operation with n
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        sc.close();
    }
}
