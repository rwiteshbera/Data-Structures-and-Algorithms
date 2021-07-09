package rwitesh.matrix;

public class TransposeOfMatrix {
    // Print the transpose of a matrix // Applicable for
    // square and rectangular matrix // Approach 1
    static void printTranspose(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;

        //Printing the matrix
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }


    // Print the transpose of a square matrix
    // Approach 2
    static void printTransposeSquare(int[][] a){
        int row =a.length, col = a.length;

        for(int i=0; i<row; i++)
        {
            for(int j=i+1; j<col; j++)
            {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        //Printing the matrix
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }


    // Print the transpose of a rectangular matrix
    // Approach 3
    static void printTransposeRectangular(int[][]x, int[][] y){
        {
            int row = x.length;
            int col = x[0].length;

            for(int i=0; i<col; i++){
                for(int j=0; j<row; j++){
                    y[i][j] = x[j][i];
                }
            }

            //Printing the matrix
            for(int i=0; i<col; i++)
            {
                for(int j=0; j<row; j++)
                {
                    System.out.print(y[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        // Approach 1 - All Matrix
//        printTranspose(arr);

        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        // Approach 2 - Square Matrix
//        printTransposeSquare(a);

        // Approach 3 - Rectangular Matrix
        int[][] x = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] y = new int[x[0].length][x.length];
        printTransposeRectangular(x,y);

    }
}
