//Time Complexity: O(N)
//Space Complexity: O(1)
package rwitesh.array;

public class SecondLargestElementInArray {
    static int secondLargest(int[] arr)
    {
        int secondLargest = -1, Largest = 0;
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]>arr[Largest])
            {
                secondLargest = Largest;   
                Largest = i;

            }
            else if(arr[i]!=arr[Largest]){
                if(secondLargest==-1)
                {
                    secondLargest = i;
                }
                if (arr[i]>arr[secondLargest])
                {
                    secondLargest = i;
                }
            }
        }
        return arr[secondLargest];
    }

    public static void main(String[] args) {
        int[] arr = {5,20,12,20,8};

        System.out.println("Second Largest Element: " + secondLargest(arr));
    }
}
