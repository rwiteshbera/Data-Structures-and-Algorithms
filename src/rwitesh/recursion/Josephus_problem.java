package rwitesh.recursion;
import java.util.Scanner;

public class Josephus_problem {
    static int Josephus(int n, int k)
    {
        if(n==1)
        {
//            return 0; // If index starts from 0
              return 1; // If index starts from 1
        }
        else
        {
//            return (Josephus(n-1,k)+k)%n; // Index from 0
            return (Josephus(n-1,k)+k-1)%n+1; // Index from 1
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n and k: ");
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println("The chosen place is " + Josephus(n,k));


        sc.close();
    }
}
