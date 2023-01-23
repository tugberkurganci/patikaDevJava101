package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public void prime(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number :");
        int number = scanner.nextInt();
        boolean isPrime=true;
        for (int i = 2; i <number ; i++) {

            for (int j = 2; j <i ; j++) {
                if (!(i%j==0))isPrime=true;
                else {isPrime=false;
                break;}
            }
        if (isPrime) System.out.print(i+" ");
        }

        }
    }

