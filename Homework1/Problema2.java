import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input value: ");
        double number = scanner.nextDouble();

        if (number == 0){
            System.out.println("Zero");
        }else {
            if (number > 0 ){
                System.out.println("Positive number");
            }else{
                System.out.println("Negative number");
            }

            if (Math.abs(number) < 1){
                System.out.println("Smallr");
            }else if (Math.abs(number) > 1000000){
                System.out.println("Large");
            }
        }
    }
}
