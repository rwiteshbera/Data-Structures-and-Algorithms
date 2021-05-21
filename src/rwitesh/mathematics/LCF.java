package rwitesh.mathematics;

import java.util.Scanner;

public class LCF {
    static int LCFValue(int x, int y)
    {
        int res = Math.max(x,y);
        while (true)
        {
            if(res%x==0 && res%y==0)
            {
                return res;
            }
            res++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("LCF of the two number: " + LCFValue(a,b));
    }
}
