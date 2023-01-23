package Loops;

import java.util.Scanner;

public class EbobEkok {
    public void calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int number1 = scanner.nextInt();
        System.out.println("enter second number");
        int number2 = scanner.nextInt();

        int ebob = 0;
        int j = 0;
        int ekok = 1;
        if (number1 > number2) {
            while (!(number2 + 1 == j)) {
                j++;
                if (number1 % j == 0 && number2 % j == 0) ebob = j;
            }
        } else {
            while (!(number1 + 1 == j)) {
                j++;
                if (number1 % j == 0 && number2 % j == 0) ebob = j;
            }
        }

        while (!(ekok % number1 == 0 && ekok % number2 == 0)) {
            ekok++;
        }

        System.out.println("ekok :" + ekok);
        System.out.println("ebob :" + ebob);
    }
}
