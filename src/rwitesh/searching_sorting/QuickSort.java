/*
The key process in quickSort is partition(). Target of partitions is, given an array and an element x of array as pivot, put x at its correct position in sorted array and put all smaller elements (smaller than x) before x, and put all greater elements (greater than x) after x. All this should be done in linear time.

Time Complexity : O(nlogn) <-----Best Case
// O(n*n) <-----Worst Case (when the array is already sorted)
        */
package rwitesh.searching_sorting;

public class QuickSort {
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j)
        {
            while(arr[i]<pivot) { i++;}
            while(arr[j]>pivot) { j--;}

            if(i<j)
            {
                swap(arr,i,j);
            }
        }

        return j;
    }

    static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            /* pi is partitioning index */
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,16,8,12,15,6,3,9,5};
       // int[] arr = {12,13,24,10,3,6,90,70};
       // int[] arr= {12,34,324,123,654,3243};

        int n = arr.length;

        quicksort(arr, 0, n-1);

        for (int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
