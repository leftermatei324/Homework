import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = scanner.nextInt();

        switch (number % 2){
            case 0:
                System.out.println("Even number");
                break;
            case -1:
                System.out.println("Odd number");
                break;
        }
    }
}
