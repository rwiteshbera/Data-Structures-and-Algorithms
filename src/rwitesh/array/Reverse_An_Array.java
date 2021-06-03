package rwitesh.array;

import java.util.Scanner;

public class Reverse_An_Array {
    static void Reverse(int[] arr)
    {
        int i=0, j=arr.length-1;
        while (i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        Reverse(arr);

        System.out.println("Array after reverse:");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
