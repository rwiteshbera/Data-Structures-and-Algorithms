package rwitesh.bitmanipulation;

public class OddEvenCheck {
    static boolean checkNumber(int N) {
        return (N&1)==0;
    }
    public static void main(String[] args) {
        int N = 14;
        if(checkNumber(N))
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
