// Rainwater Trapping Problem
//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
//Time Complexity O(n)
//
package rwitesh.array;
public class TrappingRainWater_BruteForce {
    static int maxRainWater(int[] arr)
    {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] =arr[0];
        right[n-1]=arr[n-1];

        for(int i=1 ; i<n ; i++)
        {
            left[i] = Math.max(left[i-1],arr[i]);
        }

        for(int i=n-2 ; i>=0 ; i--)
        {
            right[i] = Math.max(right[i+1],arr[i]);
        }

        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans+=(Math.min(left[i],right[i]))-arr[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,2,1,4,2,0,1,3};
        System.out.println(maxRainWater(arr));
    }
}
