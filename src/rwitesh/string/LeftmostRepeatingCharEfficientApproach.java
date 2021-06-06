package rwitesh.string;
//ABBCDD
import java.util.Scanner;

public class LeftmostRepeatingCharEfficientApproach {
    static int LeftMost(String st){
        int[] count = new int[256];

        for(int i = 0; i<st.length(); i++)
        {
            count[st.charAt(i)]++;
        }

        for(int j=0; j<st.length(); j++)
        {
            if (count[st.charAt(j)]>1)
            {
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String st = sc.next();

        System.out.println("LeftMost character is at index: " + LeftMost(st));
    }
}
