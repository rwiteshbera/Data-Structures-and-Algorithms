package rwitesh.matrix;

/*
    // Rotate Matrix by 90 Degree
    Input: 1 2 3
           4 5 6
           7 8 9
    Output:  3 6 9
             2 5 8
             1 4 7
*/
// Time Complexity: O(N*N)
// Space Complexity: O(1)
public class RotateMatrixBy90Deg_EfficientApproach {
    static void RotateMatrix(int[][] arr){
        int n = arr.length;

        //First Transpose the matrix
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //Reverse the matrix
        for(int i=0; i<n; i++)
        {
            int low = 0, high = n-1;
            while(low<high){
                arr[low][i] = arr[high][i];
                low++;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println("Before Rotation");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        RotateMatrix(arr);

        System.out.println();
        System.out.println("After Rotation");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
