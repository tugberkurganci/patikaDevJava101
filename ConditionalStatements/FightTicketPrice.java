package ConditionalStatements;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FightTicketPrice {

    public void airFare() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the distance in kilometers");

        int distance = 0;
        try {
            distance = scanner.nextInt();
            System.out.println("enter your age");
            int age = scanner.nextInt();
            System.out.println("1 => one way trip , 2 => round trip");
            int type = scanner.nextInt();
            if (!(type == 1 || type == 2)) {
                System.out.println("wrong type try again");
                airFare();
            } else {
                double totalPrice = (distance * 0.10) * type;
                if (age < 12) totalPrice = totalPrice / 2;
                if (age <= 24 && age >= 12) totalPrice = totalPrice / 100 * 90;
                if (age > 65) totalPrice = totalPrice / 100 * 70;
                if (type==2)totalPrice=totalPrice/100*80;
                System.out.println("totalPrice:" + totalPrice);
            }
        } catch (InputMismatchException e) {
            System.out.println("you can only enter integers");
            airFare();
        }
    }
}
