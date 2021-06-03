package rwitesh.array;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    static int removeDuplicates(int[] arr)
    {
        int index = 1;
        for(int i=1; i<arr.length; i++) {
            if (arr[i] != arr[index - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }

        return  index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements in sorted order:");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int size = removeDuplicates(arr);

        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
