package rwitesh.hashing;
//Array: 5, 10, 5, 4, 5, 10
// Output: 3 because of 4,5 and 10

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountDistinctElement {
    // Brute Force Approach
    static int countDistinct1(int[] arr){
        int res = 1;
        for(int i=1; i<arr.length; i++){
            int j;
            for(j=0; j<i; j++){
                if (arr[i]==arr[j]) {
                    break;
                }
            }
            if(i==j){
                res++;
            }
        }
        return res;
    }

    //Efficient Approach
    //Time Complexity: O(N)
    static int countDistinct2(int[] arr){
        Set<Integer>temp = new HashSet<>();
        for(int elements : arr){
            temp.add(elements);
        }
        return temp.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        sc.close();

//        System.out.println("Number of distinct elements is " + countDistinct1(arr));
        System.out.println("Number of distinct elements is " + countDistinct2(arr));

    }
}
