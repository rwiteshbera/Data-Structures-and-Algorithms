package rwitesh.recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    static void towerOfHanoi(int n, char from, char aux, char to){
        if(n==1){
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        towerOfHanoi(n-1,from, to, aux);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        towerOfHanoi(n-1, aux, from ,to);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks: ");
        int n = sc.nextInt();
        towerOfHanoi(n,'A','B','C');
    }
}
