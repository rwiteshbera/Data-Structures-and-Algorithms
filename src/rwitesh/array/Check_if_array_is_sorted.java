package rwitesh.array;

//Check if array is sorted

public class Check_if_array_is_sorted {
    public static void main(String[] args) {

        int[] arr={4,9,15,19,24,20};
        int n = arr.length;

        boolean isSorted = true;

        for(int i=0; i<n-1; i++)
        {
            if(arr[i+1]>arr[i])
            {
                isSorted=true;
            }
            else
            {
                isSorted=false;
                break;
            }
        }

        if(isSorted==false)
        {
            System.out.println("Array is not sorted.");
        }
        else
        {
            System.out.println("Array is sorted.");
        }
    }
}
