package Loops;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public void fibo(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number :");
        int number = scanner.nextInt();
        int [] fiboSeries=new int[number];
        fiboSeries[0]=0;
        fiboSeries[1]=1;
        for (int i = 2; i < fiboSeries.length ; i++) {
            fiboSeries[i]=fiboSeries[i-1]+fiboSeries[i-2];
        }
        System.out.println(Arrays.toString(fiboSeries));
    }
}
