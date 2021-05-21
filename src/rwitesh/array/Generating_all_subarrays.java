package rwitesh.array;

public class Generating_all_subarrays {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        int n = arr.length;

        //Nested loop for generating non-empty subarray/substring
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
