package rwitesh.hashing;

//Minimum delete operations to make all elements of array same
/*
    Input: arr[] = {4, 3, 4, 4, 2, 4}
    Output: 2
    After deleting 2 and 3 from array, array becomes
    arr[] = {4, 4, 4, 4}

    Input: arr[] = {1, 2, 3, 4, 5}
    Output: 4
    We can delete any four elements from array.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumDeleteOperationToMakeArrayElemSame {
    static int MinimumDeletion(int[] arr, int size){
        HashMap<Integer,Integer>hash = new HashMap<>();

        for(int i=0; i<size; i++){
            hash.put(arr[i], hash.getOrDefault(arr[i],0)+1);
        }

        int max_frequency = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> e : hash.entrySet()){
            max_frequency = Math.max(max_frequency, e.getValue());
        }

        return size-max_frequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the array elements: ");
        int [] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Minimum Delete operation: ");
        System.out.println(MinimumDeletion(arr,n));
    }
}
