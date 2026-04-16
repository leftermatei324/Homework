package Homework2;

import java.util.Scanner;

public class Prob3String {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("First string: ");
        String s1 = scanner.nextLine();

        System.out.print("Second string: ");
        String s2 = scanner.nextLine();

        String result = s1 + s2;

        System.out.println("Result: " + result);
    }
}
