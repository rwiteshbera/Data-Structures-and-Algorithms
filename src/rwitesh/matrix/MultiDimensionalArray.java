package rwitesh.matrix;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{10,11,12,13}};
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
