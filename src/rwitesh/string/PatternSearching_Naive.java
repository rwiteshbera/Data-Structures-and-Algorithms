package rwitesh.string;
//Time Complexity:
// O((n-m)*m) ---> For Outer Loop (n-m) and for inner loop m
//Space Complexity: O(1)
import java.util.Scanner;

public class PatternSearching_Naive {
    static void SearchIndex(String text, String pattern)
    {
        int n = text.length();
        int m = pattern.length();

        for(int i=0; i<=(n-m); i++)
        {
            int j;
            for(j=0; j<m; j++)
            {
                if (pattern.charAt(j)!=text.charAt(j+i))
                {
                    break;
                }
            }

            if (j==m)
            {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text: ");
        String text = sc.nextLine();
        System.out.println("Enter a pattern: ");
        String pattern = sc.nextLine();
        sc.close();
        SearchIndex(text, pattern);
    }
}
