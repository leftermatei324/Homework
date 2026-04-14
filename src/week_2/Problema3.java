package week_2;

import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        if (a>b && b>c){
            System.out.println("Decreasing");
        }else if (a<b && b<c){
            System.out.println("Increasing");
        }else {
            System.out.println("Random order");
        }
    }
}
