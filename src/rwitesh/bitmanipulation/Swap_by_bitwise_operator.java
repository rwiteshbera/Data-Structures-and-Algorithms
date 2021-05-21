package rwitesh.bitmanipulation;

public class Swap_by_bitwise_operator {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        System.out.println("Before swap: a = " + a + " and b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap: a = " + a + " and b = " + b);
    }
}
