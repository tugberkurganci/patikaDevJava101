package Loops;

import java.util.Scanner;

public class PowerOf4Or5 {
    public void power4() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();
        for (int i = 2; i < number; i = i * 4) {
            System.out.println(i);
        }
        System.out.println("these numbers are multiples of 4");
    }

    public void power5() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();
        for (int i = 2; i < number; i = i * 4) {
            System.out.println(i);
        }
        System.out.println("these numbers are multiples of 5");
    }
}

