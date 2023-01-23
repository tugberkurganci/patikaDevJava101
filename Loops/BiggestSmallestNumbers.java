package Loops;

import java.util.Scanner;

public class BiggestSmallestNumbers {
    public void sort() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("how many numbers will you enter :");
        int size = scanner.nextInt();


        int smallest = 0;
        int biggest = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("enter "+(i+1)+"."+" number :");
            int number = scanner.nextInt();
            if (i == 0) {
                smallest = number;
                biggest = number;
            } else {
                if (number < smallest) smallest = number;
                if (number > biggest) biggest = number;

            }
        }
        System.out.println("smallest :"+smallest);
        System.out.println("biggest : "+biggest);
    }

}

