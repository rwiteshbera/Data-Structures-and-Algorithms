/*THE ARRAY MUST BE SORTED TO IMPLEMENT BINARY SEARCH
Binary Search: Search a sorted array by repeatedly dividing the search interval in half. Begin with an interval covering the whole array. If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. Otherwise narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.
-----------RECURSIVE APPROACH------------
 */
package rwitesh.searching_sorting;

public class BinarySearch {
    static int binarysearch(int[] arr, int l, int h, int key) {
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                return binarysearch(arr, l, mid - 1,key);
            } else {
                return binarysearch(arr, mid + 1, h,key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int n = arr.length;
        int key = 23;

        int res = binarysearch(arr, 0, n - 1, key);

        if (res == -1) {
            System.out.println("Element is not present in the array!");
        } else {
            System.out.println("Element is present at the index: " + res);
        }
    }
}
