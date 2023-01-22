package Loops;

import java.util.Scanner;

public class ExponentialNumber {
    public void exp() {

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the number");
        int number=scanner.nextInt();
        System.out.println("enter the upper number");
        int expNumber=scanner.nextInt();

        int total=1;
        for (int i = 0; i <expNumber ; i++) {
            total=total*number;
        }
        System.out.println("result :"+total);

    }
}
