package rwitesh.hashing;

/*
Input : arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6}
Output : Intersection = {3,5}
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    //Iterative Approach
    static void Intersection1(int[] arr1, int[] arr2)
    {
        ArrayList<Integer>Temp = new ArrayList<>();
        int i =0 ,j = 0;
        while (i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                Temp.add(arr1[i++]);
            }
            else if(arr1[i]>arr2[j]){
                Temp.add(arr2[j++]);
            }
            else {
                Temp.add(arr1[i]);
                i++;
                j++;
            }
        }

        //Handling remaing element of the larger array
        while (i<arr1.length){
            Temp.add(arr1[i++]);
        }
        while (j<arr2.length){
            Temp.add(arr2[j++]);
        }

        for (Integer integer : Temp) {
            System.out.print(integer + " ");
        }
        System.out.println();
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

//        Intersection1(arr1,arr2);
        Intersection2(arr1,arr2);
    }
}
