package rwitesh.array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter 5 integers: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        //Printing array
        System.out.print("The array is: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
