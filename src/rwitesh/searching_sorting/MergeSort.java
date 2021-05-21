package rwitesh.searching_sorting;

public class MergeSort {
    static void mergesort(int[] arr, int l, int h)
    {
        if(l<h)
        {
            int mid = l+(h-l)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,h);
            merge(arr,l,mid,h);
        }
    }

    static void merge(int[] arr, int l, int mid, int h)
    {
        int n1 = mid-l+1; // Size of first temp array
        int n2 = h-mid; // Size of second temp array

        //Creating temp arrays
        int[] L = new int [n1];
        int[] R = new int [n2];

        //Copy elements to temp array
        for(int i=0;i<n1;i++)
        {
            L[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++)
        {
            R[j]=arr[mid+1+j];
        }

        //Merge temp arrays
        int i = 0, j=0;
        int k = l;
        while(i<n1 && j<n2)
        {
            if(L[i]<= R[j])
            {
                arr[k]=L[i];
                i++;
            }
            else
            {
                arr[k]=R[j];
                j++;
            }
            k++;

        }

        //Copy remaining elements
        while(i<n1)
        {
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=R[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,5,30,15,7};
        int n = arr.length;

        mergesort(arr, 0, n-1);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
