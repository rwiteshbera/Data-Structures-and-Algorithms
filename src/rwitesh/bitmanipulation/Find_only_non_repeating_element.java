package rwitesh.bitmanipulation;

import java.util.Scanner;

public class Find_only_non_repeating_element {
    static void nonRepeatingElement(int arr[], int n)
    {
        int res=0;
        for(int i=0;i<n;i++)
        {
            res=res^arr[i];
        }
        System.out.println("Only non-repeating element is: "+ res);
    }
    public static void main(String[] args) {
        int elements;
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        elements = sc.nextInt();

        int arr[] = new int[elements];
        System.out.println("Enter the elements: ");
        for(int i=0;i<elements;i++)
        {
            arr[i]=sc.nextInt();
        }

        nonRepeatingElement(arr,elements);

        sc.close();
    }
}
