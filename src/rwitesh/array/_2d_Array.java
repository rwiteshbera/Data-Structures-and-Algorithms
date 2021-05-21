package rwitesh.array;

public class _2d_Array {
    public static void main(String[] args) {
        int [][]a = {{1,2,3,4},{10,11,12,13}};

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
