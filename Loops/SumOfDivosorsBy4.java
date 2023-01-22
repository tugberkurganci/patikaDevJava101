package Loops;

import java.util.Scanner;

public class SumOfDivosorsBy4 {
    public void sofdb4() {

        Scanner scanner = new Scanner(System.in);

        boolean isNegative = false;
        int total = 0;
        while (!isNegative) {
            System.out.println("enter the number");
            int number = scanner.nextInt();
            if (number %2==1) isNegative = true;
            else {

                if (number %4==0) total += number;
            }

        }
        System.out.println("sum of even and multiples of 4:"+total);
    }
}
