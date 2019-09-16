package main;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            B += A.charAt(i);
        }
        if (A.toLowerCase().equals(B.toLowerCase()))
            System.out.print("Yes");
        else
            System.out.print("No");

    }
}
