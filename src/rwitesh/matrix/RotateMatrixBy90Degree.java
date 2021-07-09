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
public class RotateMatrixBy90Degree {
    static void MatrixRotation(int[][] arr, int row, int col){

    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int row = arr.length;
        int col = arr[0].length;

        MatrixRotation(arr, row, col);
    }
}
