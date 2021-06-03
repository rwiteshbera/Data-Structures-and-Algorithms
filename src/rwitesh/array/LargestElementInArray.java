package rwitesh.array;

import java.util.Scanner;

public class LargestElementInArray {
    static int Large(int[] arr){
        int max = arr[0];

        for(int i=1; i<arr.length-1; i++)
        {
            if (arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Largest element is: " + Large(arr));
    }
}
