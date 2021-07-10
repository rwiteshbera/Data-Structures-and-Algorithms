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
// Space Complexity: O(N)

public class RotateMatrixBy90Degree {
    static void MatrixRotation(int[][] arr, int n){
        int[][] temp = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                temp[n-j-1][i] = arr[i][j];
            }
        }

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = temp[i][j];
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int n = arr.length;

        System.out.println("Before Rotation: ");
        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        MatrixRotation(arr,n);

        System.out.println();
        System.out.println("After Rotation: ");
        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
