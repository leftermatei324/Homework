package Homework2;

import java.util.Scanner;

public class Prob2String {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        System.out.print("Enter index: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < text.length()) {
            System.out.println("Character: " + text.charAt(index));
        } else {
            System.out.println("Invalid index");
        }
    }
}
