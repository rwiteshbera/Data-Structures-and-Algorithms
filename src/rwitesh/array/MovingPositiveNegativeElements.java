//Move all negative numbers to beginning and positive to end with constant extra space
/*Solve this problem using two pointer like left and right pointer
 * 1. Check if left and right both pointer elements are negative -> increment left pointer
 * 2. If left pointer is positive and right is negative -> swap both elements and increment left and decrement right pointer
 * 3. Left is positive and right is also positive -> simply decrement right pointer
 * 4. Left is negative and right is positive -> increment left pointer
 * 5. Repeat until left pointer<=right pointer*/
package rwitesh.array;

public class MovingPositiveNegativeElements {
    static void shiftElements(int[] arr, int n)
    {
        int left = 0;
        int right = n-1;

        while (left<=right)
        {
            if(arr[left]<0 && arr[right]<0)
            {
                left++;
            }
            else if(arr[left]>0 && arr[right]<0)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
            else if(arr[left]>0 && arr[right]>0)
            {
                right--;
            }
            else if(arr[left]<0 && arr[right]>0)
            {
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-12,11,-13,-5,6,-7,5,-3,11};
        int n = arr.length;

        shiftElements(arr,n);
        for(int i=0 ; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

//Time Complexity: O(N)
//Auxiliary Space: O(1)
