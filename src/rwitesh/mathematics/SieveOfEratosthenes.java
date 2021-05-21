package rwitesh.mathematics;

import java.util.*;

public class SieveOfEratosthenes {
    static void GetPrimeNumber(int n)
    {
        //Creating a boolean array and storing all the value true
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);

        for(int i=2; i*i<=n; i++)
        {
            if(isPrime[i])
            {
                for(int j = i*2; j<=n; j=j+i)
                {
                    isPrime[j] = false;
                }

            }
        }

        for(int i=2; i<=n; i++)
        {
            if (isPrime[i])
            {
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        GetPrimeNumber(number);
    }
}
