package rwitesh.bitmanipulation;

import java.util.Scanner;

public class Odd_Even_Bitwise_Operator {
    public static void main(String[] args) {
        System.out.println("Enter an integer value:");
        int num;
        Scanner sc =new Scanner(System.in);
        num = sc.nextInt();

        if((num&1)==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }

        sc.close();
    }
}
