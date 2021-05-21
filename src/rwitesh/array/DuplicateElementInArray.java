//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//There is only one repeated number in nums, return this repeated number.
package rwitesh.array;

import java.util.Arrays;

public class DuplicateElementInArray {
    public static int findDuplicate(int[] nums)
    {
       Arrays.sort(nums);
       for(int i=1; i<nums.length; i++)
       {
           if(nums[i]==nums[i-1])
           {
               return nums[i];
           }
       }
       return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,8};
        System.out.println("The dupliclate element is: " + findDuplicate(nums));
    }
}
