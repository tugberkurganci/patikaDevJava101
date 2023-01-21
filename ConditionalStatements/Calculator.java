package ConditionalStatements;

import java.util.Scanner;

public class Calculator {


    public void calc() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first number");
        int number1 = scanner.nextInt();
        System.out.println("enter second number");
        int number2 = scanner.nextInt();

        System.out.println("pick what you want 1-sum 2-extraction- 3-multilication 4-divide ");

        int process = scanner.nextInt();

        switch (process) {
            case 1:
                System.out.println(number1 + number2);
                break;
            case 2:
                System.out.println(number1 - number2);
                break;
            case 3:
                System.out.println(number1 * number2);
                break;

            case 4:

            switch (number2) {
                case 0:
                    System.out.println("it cant be divide with 0");
                    break;
                default:
                    System.out.println(number1 / number2);
            }
            default:
                System.out.println("try again");
        }

    }
}
