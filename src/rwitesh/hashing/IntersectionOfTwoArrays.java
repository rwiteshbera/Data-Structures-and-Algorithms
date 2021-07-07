package rwitesh.hashing;

/*
Input : arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6}
Output : Intersection = {3,5}
*/

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    //Iterative Approach // Time Complexity: O(M*N) If
    // the size of the array 1 is M and array 2 is N
    static void Intersection1(int[] arr1, int[] arr2){
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr2.length; j++)
            {
                if (arr1[i]==arr2[j]){
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }


    //Efficient Approach using Set Function
    static void Intersection2(int[] arr1, int[] arr2){
        Set<Integer>set = new HashSet<>();
        for(int element : arr1){
            set.add(element);
        }

        for(int elem : arr2){
            if(set.contains(elem)){
                System.out.print(elem + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,4,5,7};
        int[] arr2 = {2,3,5,6};

        Intersection1(arr1,arr2);
//        Intersection2(arr1,arr2);
    }
}
