package rwitesh.array;

import java.util.Scanner;

public class Largest_sum_subarray_KADANES_Algo {
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


        int max_sum=0;
        int current_sum=0;

        for(int i=0;i<n;i++)
        {
            current_sum+=arr[i];
            if(current_sum>max_sum)
            {
                max_sum=current_sum;
            }
            if(current_sum<0)
            {
                current_sum=0;
            }
        }
        System.out.println("Largest sum of subarray is: " + max_sum);
        sc.close();
    }
}
