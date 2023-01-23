package Loops;

import java.util.Scanner;

public class TriangleWithStars {
    public void invert(){

        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the size:");
        int size=scanner.nextInt();


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < size - 1; j++) {
                System.out.print("*");
            }
            for (int j = i; j < size - 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
