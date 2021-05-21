//Efficient way
//Time Complexity: O(m+n)
package rwitesh.searching_sorting;

public class MergeTwoSortedArray {
    static void Merge(int[] arr1, int[] arr2, int m, int n)
    {
        int i=0; int j=0;
        while(i<m && j<n)
        {
            if(arr1[i]<=arr2[j])
            {
                System.out.print(arr1[i]+ " ");
                i++;
            }
            else
            {
                System.out.print(arr2[j] + " ");
                j++;
            }
        }
        while (i<m)
        {
            System.out.print(arr1[i]+ " ");
            i++;
        }
        while (j<n)
        {
            System.out.print(arr2[j]+ " ");
            j++;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {10,20,50};
        int[] arr2 = {5,50,50};

        int m = arr1.length;
        int n = arr2.length;

        Merge(arr1,arr2,m,n);
    }
}
