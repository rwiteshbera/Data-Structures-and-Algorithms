// Find the majority element in an array using Moore's voting algorithm.
//Time Complexity : O(n)

//Approach
/*The first step gives the element that maybe the majority element in the array. If there is a majority element in an array, then this step will definitely return majority element, otherwise, it will return candidate for majority element.

Check if the element obtained from the above step is majority element. This step is necessary as there might be no majority element.

Explanation:
[5,1,4,5,5]
5->1
5->0
1->1
1->0
4->1
4->0
5->1
5->2

Now the last element 5 may be majority
so we have to check it again using loop whether it is majority element or not
*/
package rwitesh.array;

public class Majority_element_Moores_Voting_Algo {
    public static void main(String[] args) {
        int arr[] = {4, 4, 2, 3, 4};
        int size = arr.length;
        int ansIndex = 0; //  Assuming that the first element is majority element
        int count = 1;

        for (int i = 1; i < size; i++)
        {
            if (arr[i] == arr[ansIndex])
            {
                count++;
            }
            else
            {
                count--;
            }

            if (count == 0)
            {
                ansIndex = i;
                count = 1;
            }
        }

        int n = 0;
        for (int i = 0; i < size; i++)
        {
            if (arr[ansIndex] == arr[i])
            {
                n++;
            }
        }

        if (n > size / 2)
        {
            System.out.print(arr[ansIndex]);
        }
        else
        {
            System.out.println("No majority element found");
        }
    }
}
