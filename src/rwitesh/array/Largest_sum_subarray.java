package rwitesh.array;

//Find the largest sum of a contiguous subarray
//Brute Force Process

import java.util.Scanner;

public class Largest_sum_subarray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }


        int max_sum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++)
        {
            int sum = 0;
            for (int j = i; j < n; j++)
            {
                sum += arr[j];
                if (sum > max_sum)
                {
                    max_sum = sum;
                    start = i;
                    end = j;
                }
            }
        }

        System.out.println("Maximum subarray found between index "+ start + " to " +end);
        System.out.print("Largest sum of contiguous subarray is :" + max_sum);

        sc.close();
    }
}
