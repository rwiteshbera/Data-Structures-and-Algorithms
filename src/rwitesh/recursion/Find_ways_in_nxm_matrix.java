//Count all possible paths from top left to bottom right of a mXn matrix
// The problem is to count all the possible paths from top left to bottom right of a mXn matrix with the constraints that from each cell you can either move only to right or down

package rwitesh.recursion;
import java.util.Scanner;

public class Find_ways_in_nxm_matrix {

    static int Paths(int m, int n)
    {
        if(m==1 || n==1)
        {
            return 1;
        }
        else
        {
            return  Paths(m,n-1)+Paths(m-1,n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        System.out.println("Number of ways is: " + Paths(row,col));

        sc.close();
    }
}
