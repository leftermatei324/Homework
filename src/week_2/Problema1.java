package week_2;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numvber: ");
        int number = scanner.nextInt();

        if(number >= 0){
            System.out.println("Number is positive");
        }else {
            System.out.println("Number is negative");
        }
    }
}
