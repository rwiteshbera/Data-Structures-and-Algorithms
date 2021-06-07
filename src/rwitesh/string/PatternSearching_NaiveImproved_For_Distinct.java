package rwitesh.string;

import java.util.Scanner;

public class PatternSearching_NaiveImproved_For_Distinct {
    static void SearchIndex(String text, String pattern)
    {
        int n = text.length();
        int m = pattern.length();

        for(int i=0; i<=(n-m); )
        {
            int j;
            for(j=0; j<m; j++) {
                if (pattern.charAt(j) != text.charAt(i + j)) {
                    break;
                }
            }
                if (j==m)
                {
                    System.out.print(i + " ");
                }
                if (j==0)
                {
                    i++;
                }
                else{
                    i+=j;
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
