package Loops;

import java.util.Scanner;

public class DigitsTotal {
    public void total(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the number");
        int number=scanner.nextInt();
        int a=number;
        int total=0;
        while (!(a==0)){

            int b=a%10;
            total+=b;
            a=a/10;

        }
        System.out.println("number of digits total :"+total);
    }
}
