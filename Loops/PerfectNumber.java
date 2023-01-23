package Loops;

import java.util.Scanner;

public class PerfectNumber {
    public void perfecto(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number :");
        int number = scanner.nextInt();
        int total=0;

        for (int i = 1; i <number ; i++) {
            if (number%i==0)total+=i;
        }
        if (total==number) System.out.println("perfect number");
        else System.out.println("this is not perfect number");
    }
}
