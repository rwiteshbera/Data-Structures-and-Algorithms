package rwitesh.array;

import java.util.Scanner;

public class Check_If_Array_Sorted_2 {
    static boolean checkArray(int[] arr)
    {
        for(int i=1; i<arr.length-1; i++)
        {
            if (arr[i]<arr[i-1])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");

        int n = sc.nextInt();

        System.out.println("Enter the elements: ");

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        boolean res = checkArray(arr);
        if(res)
        {
            System.out.println("Array is sorted.");
        }
        else {
            System.out.println("Array is not sorted");
        }
    }
}
