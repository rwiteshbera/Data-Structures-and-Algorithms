/* The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array
Time Complexity : O(n*n);
 */
package rwitesh.searching_sorting;

public class SelectionSort {
    void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            if (min_index != i) {
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64,25,12,22,11};
        int size = arr.length;
        System.out.println("Before sorting");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        SelectionSort obj = new SelectionSort();
        obj.selectionSort(arr, size);

        System.out.println("After sorting");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}