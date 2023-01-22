package Loops;

import java.util.Scanner;

public class AverageOfDivisorsBy12 {
    public void aodsb12(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        int total=0;
        int count=0;
        for (int i = 1; i <number ; i++) {
            if (i%3==0 && i%4==0 ){
                total+=i;
                count++;

            }
        }
        if(number>11)
        System.out.println("Average is: "+total/count);
        else System.out.println("Average is: 0");
    }
}
