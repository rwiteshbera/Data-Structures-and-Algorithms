package rwitesh.array;
/*Brute Force Approach
   Input: 6
          6 3 -2 5 -4 7
          2
   Output: 1 4
 */

//Time Complexity: O(N^2)
import java.util.Scanner;

public class FindSubarrayWithGivenSum {
    static void givenSumSubarray(int[] arr, int sum)
    {
        for(int i=0; i<arr.length; i++)
        {
            int current_sum = 0;
            for(int j=i; j<arr.length; j++)
            {
                if (current_sum==sum)
                {
                    System.out.println(i + " " + (j-1));
                }
                else {
                    current_sum+=arr[j];
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the sum: ");
        int sum = sc.nextInt();

        givenSumSubarray(arr,sum);
    }
}