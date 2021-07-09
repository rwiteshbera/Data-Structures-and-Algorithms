package rwitesh.matrix;

public class Passing2DArrayArguments {
    static void printArray(int[][] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{11,12,13,14,15},{45,46,47,48,49}};

        printArray(arr);
    }
}
