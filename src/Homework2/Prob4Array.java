package Homework2;

import java.util.Scanner;

public class Prob4Array {
    public static void main(String[] args){
        int[] array = {6, 5, 4, 9, 8, 7, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter element to insert: ");
        int element = scanner.nextInt();
        int position = scanner.nextInt();

        int[] array2 = new int[array.length + 1];

        for (int i = 0 ; i< array2.length ; i++){
            if (i == position){
                array2[i]=element;
            } //?????????????????????????
        }

        for (int x : array2){
            System.out.println(x + " ");
        }
    }
}
