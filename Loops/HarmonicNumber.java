package Loops;

import java.util.Scanner;

public class HarmonicNumber {
    public void harmo(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int number=scanner.nextInt();
        double total=0;

        for (double i = 1; i <=number ; i++) {

            total+=1/i;
        }
        System.out.println("harmonic number is"+total);
    }
}
