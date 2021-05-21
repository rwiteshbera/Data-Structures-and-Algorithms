package rwitesh.string;
import java.util.Scanner;
public class Introduction_to_string {
    public static void main(String[] args) {
        String name = new String("Geeksforgeeks");
        System.out.println(name);

        String name1 = "Leetcode";
        System.out.println(name1);

        String name2 = "Codechef";
        System.out.format(name2);

        System.out.println(); //Creating new line

        int a = 6;
        float b= 3.234f;
        System.out.print("The value of a is "+ a+" and the value of b is "+ b);

        System.out.println();

        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String st = sc.next(); // For scanning only one word until a whitespace appears.
//        String st = sc.nextLine(); // For scanning the whole line
        System.out.println(st);

    }
}
