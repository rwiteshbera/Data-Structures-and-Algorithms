//Count distinct elements in every window of size k
/*
Input: arr[] = {1, 2, 1, 3, 4, 2, 3};
       k = 4
Output: 3 4 4 3

Explanation:
First window is {1, 2, 1, 3}, count of distinct numbers is 3
Second window is {2, 1, 3, 4} count of distinct numbers is 4
Third window is {1, 3, 4, 2} count of distinct numbers is 4
Fourth window is {3, 4, 2, 3} count of distinct numbers is 3
* */
//BruteForce Approach
//Time Complexity: O((N-K+1)*K^2)
package rwitesh.hashing;

import java.util.Arrays;

public class CountDistinctElementInEveryWindow {
//    static int countWindowDistinct(int[] win,int k){
//        int dist_count = 0;
//        for(int i=0; i<k; i++){
//            int j;
//            for(j=0; j<i; j++){
//                if (win[i]==win[j]){
//                    break;
//                }
//            }
//            if (i==j){
//                dist_count++;
//            }
//        }
//        return dist_count;
//    }
//    static void countDistinct(int[] arr, int k){
//        for(int i=0; i<arr.length-k+1; i++){
//            System.out.println(countWindowDistinct(Arrays.copyOfRange(arr,i,arr.length),k) + " ");
//        }
//    }
    static void countDistinct(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n - k + 1; i++) {
            int count = 0;
            for (int j = 0; j < k; j++) {
                boolean flag = false;
                for (int p = 0; p < j; p++) {
                    if (arr[i + j] == arr[i+p]) {
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    count++;
                }
            }
            System.out.print(count+ " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,2,3};
        int k = 4;
        countDistinct(arr, k);
    }
}
