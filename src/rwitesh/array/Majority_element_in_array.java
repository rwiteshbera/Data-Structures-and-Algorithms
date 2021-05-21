
// Write a function which takes an array and prints the majority element (if it exists), otherwise prints “No Majority Element”. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).
//Time Complexity: O(n^2)

package rwitesh.array;
import java.util.Scanner;

public class Majority_element_in_array {
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

        int maxSum=0;
        int count=0;
        int index=-1;

        for(int i=0;i<n;i++)
        {
            count=0;

            for(int j=i;j<n;j++)
            {
                if(arr[j]==arr[i])
                {
                    count++;
                }
                if(count>maxSum)
                {
                    maxSum=count;
                    index = i;
                }
            }
        }

        if(maxSum>(n/2))
        {
            System.out.print(arr[index]+ " ");
        }
        else
        {
            System.out.println("No majority element found.");
        }

        sc.close();
    }
}
