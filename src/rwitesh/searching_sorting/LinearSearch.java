//Given an array arr[] of n elements, write a function to search a given element x in arr[].
package rwitesh.searching_sorting;

public class LinearSearch {
    static int linearsearch(int[] arr, int n, int key)
    {
        for(int i=0 ; i<n ; i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 12, 15, 3, 7, 8};
        int n = arr.length;
        int key = 12;

        int res = linearsearch(arr,n,key);

        if(res==-1)
        {
            System.out.println("Element is not present in the array!");
        }
        else
        {
            System.out.println("Element is present at the index: " + res);
        }
    }
}

// The time complexity of the above algorithm is O(n).