package rwitesh.hashing;

/*
Input : arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6}
Output : Union : {1, 2, 3, 4, 5, 6, 7}
*/

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {
    static void Union(int[] arr1, int[] arr2)
    {
        Set<Integer>hash= new HashSet<>();
        for(int elem1 : arr1)
        {
            hash.add(elem1);
        }
        for(int elem2 : arr2)
        {
            hash.add(elem2);
        }

        System.out.println("Size : " + hash.size());
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,5,7};
        int[] arr2 = {2,3,5,6};

        Union(arr1,arr2);
    }
}

//Time Complexity: O(M+N)