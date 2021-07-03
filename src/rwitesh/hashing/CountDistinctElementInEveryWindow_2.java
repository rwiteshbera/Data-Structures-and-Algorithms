package rwitesh.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctElementInEveryWindow_2 {
    static void printDistinct(int[] arr, int k){
        int n = arr.length;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0; i<k; i++)
        {
            m.put(arr[i], m.getOrDefault(arr[i],0)+1);
        }
        System.out.print(m.size() + " ");

        for(int i=k; i<n; i++)
        {
            if (m.get(arr[i-k])==1){
                m.remove(arr[i-k]);
            }
            else{
                m.put(arr[i-k],m.get(arr[i-k]+1));
            }
            m.put(arr[i], m.getOrDefault(arr[i],0)+1);
            System.out.print(m.size() + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,2,3};
        int k = 4;
        printDistinct(arr,k);
    }
}
