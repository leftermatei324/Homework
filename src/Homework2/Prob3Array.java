package Homework2;

import java.util.Scanner;

public class Prob3Array {
    public static void main(String[] args){
        int[] array = {6, 5, 4, 9, 8, 7, 0};
        int index = -1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int element = scanner.nextInt();

        for (int i = 0 ; i< array.length ; i++){
            if(array[i] == element){
                index = i;
                break;
            }
        }

        System.out.println("The index is: " + index);
    }
}
