package Homework2;

public class Prob1 {
    public static void main(String[] args){
        int[] array = {6, 5, 4, 9, 8, 7, 0};

        int sum = 0;
        for (int i = 0 ; i< array.length ; i++){
            sum += array[i];
        }

        System.out.println("The sum of the array is: " + sum);
    }
}
