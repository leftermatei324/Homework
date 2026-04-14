package week_2;

public class Main {
    public static void main(String[] args) {
        /* //Problema 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numvber: ");
        int number = scanner.nextInt();

        if(number >= 0){
            System.out.println("Number is positive");
        }else {
            System.out.println("Number is negative");
        }
         */

        /* //Problema 2
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

         */


        /* //Problema 3
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
         */

        /* //Problema 4
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weekday number: ");
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Its not a weekday");
        }

         */

        /* //Problema 5
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

         */
    }
}