package rwitesh.bitmanipulation;

import java.util.Scanner;

public class Find_ith_bit {
    public static void main(String[] args) {

        System.out.println("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Enter the index: ");
        int i = sc.nextInt();

        int index = (i-1);

        int mask = (1<<index);
        int ans = num&mask;

        if(ans==0) {
            System.out.println("The "+i+"th bit is: 0");
        }
        else {
            System.out.println("The "+i+"th bit is: 1");
        }

        sc.close();
    }
}
