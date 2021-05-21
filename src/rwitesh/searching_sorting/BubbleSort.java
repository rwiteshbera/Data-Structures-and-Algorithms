/* Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
Time Complexity - O(n*n)
*/
package rwitesh.searching_sorting;

public class BubbleSort {
    void bubbleSort(int[] arr, int n)
    {
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //Swapping the adjacent elements if they are in wrong order
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }  
    }
    public static void main(String[] args) {

        //Creating Object
        BubbleSort obj = new BubbleSort();
        int[] arr = {4,3,2,7,1,5};
        int n = arr.length;

        //Printing Unsorted array
        System.out.print("Unsorted array: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println(" "); // Adding space in terminal

        obj.bubbleSort(arr, n);

        //Printing the sorted array
        System.out.print("Sorted array: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        
    }
    
}
