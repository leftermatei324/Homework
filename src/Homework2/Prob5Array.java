package Homework2;

import java.util.Scanner;

public class Prob5Array {
    public static void main(String[] args){
        int[] array = {6, 5, 4, 9, 8, 7, 0};

        int[] newarray = new int[array.length];
        int count = 0;

        for (int i = 0 ; i<array.length; i++){
            boolean isDuplicate = false;

            for (int j = 0; j < count; j++){
                if(array[i] == newarray[j]){
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                newarray[count] = array[i];
                count++;
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = newarray[i];
        }

        for (int x : result) {
            System.out.print(x + " ");
        }

    }
}
