package rwitesh.hashing;

import java.util.HashSet;
import java.util.Set;

//Example
/*
Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1}
Output: arr2[] is a subset of arr1[]
* */
public class FindSubsetOfArray {
    //Iterative Approach // Brute Force Approach
    //Time Complexity : O(m*n)
    /*
    static boolean SubsetCheck(int[] arr1, int[] arr2)
    {
        for(int i=0; i<arr2.length; i++)
        {
            int j;
            for(j=0; j<arr1.length; j++)
            {
                if (arr1[j]==arr2[i]){
                    break;
                }
            }
            if (j==arr1.length)
            {
                return  false;
            }
        }
       return  true;
    }
    */

    //Using Hashing
    static boolean SubsetCheck(int[] arr1, int[] arr2)
    {
        Set<Integer>hset = new HashSet<>();
        for(int i=0; i<arr1.length; i++)
        {
            hset.add(arr1[i]);
        }

        for(int j=0; j<arr2.length; j++)
        {
            if (!hset.contains(arr2[j])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr1 = {11,1,13,21,3,7};
        int [] arr2 = {11,3,7,1};

        if(SubsetCheck(arr1, arr2)){
            System.out.println("arr2 is subset of arr1");
        }
        else {
            System.out.println("arr2 is not a subset.");
        }
    }
}
