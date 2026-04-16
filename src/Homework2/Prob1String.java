package Homework2;

import java.util.Scanner;

public class Prob1String {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        String reversed = "";

        for (int i = text.length() - 1; i >=0; i--){
            reversed = reversed + text.charAt(i);
        }

        System.out.println("Reversed: " + reversed);
    }
}
