package rwitesh.matrix;

import java.util.Scanner;

public class MatrixBoundaryTraversal {
    static void printArray(int[][] arr){
       int row = arr.length;
       int col = arr[0].length;

       if(row==1){ //Handling corner case : if no. of row is 1
           for(int i=0; i<row; i++){
               System.out.print(arr[0][i] + " ");
           }
       }
       else if(col==1){ //Handling corner case : if no. of column is 1
           for(int i=0; i<col; i++){
               System.out.print(arr[i][0] + " ");
           }
       }
       else{
           //First Row
            for(int i=0; i<col; i++)
            {
                System.out.print(arr[0][i] + " ");
            }
            //Rightmost column
           for(int i=1; i<row; i++)
           {
               System.out.print(arr[i][col-1] + " ");
           }

           //Last Row
           for(int i=col-2; i>=0; i--)
           {
               System.out.print(arr[row-1][i]+ " ");
           }
           //First Column
           for(int i=row-2; i>=1; i--)
           {
               System.out.print(arr[i][0] + " ");
           }
       }


    }
    public static void main(String[] args) {
        System.out.println("Enter number of row and column: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] arr = new int[row][column];
        System.out.println("Enter the elements: ");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
    }
}
