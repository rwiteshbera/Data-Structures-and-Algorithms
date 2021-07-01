package rwitesh.hashing;

import java.util.HashMap;

public class FindSubarrayWithGivenSum {
    static void subarraySum(int[] arr, int sum)
    {
        int current_sum = 0, start = 0, end = -1;
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0; i<arr.length; i++)
        {
            current_sum+=arr[i];

            //Check if current_sum is equal to sum, then it means the subarray is starting from the
            //index 0, so stop it
            if (current_sum==sum)
            {
                start = 0;
                end = i;
                break;
            }

            //if hashMap already has the value, means we already
            // have subarray with the sum - so stop
            if (hashMap.containsKey(current_sum-sum))
            {
                start = hashMap.get(current_sum-sum)+1;
                end = i;
                break;
            }

            //If value is not present then add the hashMap
            hashMap.put(current_sum,i);
        }

        // if end is -1 : means we have reached end without the sum
        if (end==-1)
        {
            System.out.println("No subarray found with given sum.");
        }
        else {
            System.out.println("Sum found between indexes " + start + " to " + end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,15,-5,15,-10,5};
        int sum = 5;
        subarraySum(arr,sum);
    }
}
