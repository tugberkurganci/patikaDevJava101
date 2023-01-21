package ConditionalStatements;

import java.util.Scanner;

public class ActivitySelection {

    public void find1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter heat");
        int heat = scanner.nextInt();

        if (heat < 5) System.out.println("you can go ski");
        if (heat > 5 && heat < 15) System.out.println("you can go cinema");
        if (heat > 10 && heat < 25) System.out.println("you can go picnic");
        ;
        if (heat > 25) System.out.println("you can go swim");
    }

    public void find2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter heat");
        int heat = scanner.nextInt();

        if (heat > 25) {
            System.out.println("you can go swim");
        } else if (heat < 25 && heat > 15) {
            System.out.println("you can go picnic");
        } else if (heat < 15 && heat > 10) {
            System.out.println("you can go picnic");
            System.out.println("you can go cinema");
        } else if (heat > 5 && heat < 10) {
            System.out.println("you can go cinema");
        } else System.out.println("you can go ski");
    }
}
